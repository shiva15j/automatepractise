package testngpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyzLogin {

	public WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	public void VerifyLogin() throws InterruptedException {

		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));

		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
