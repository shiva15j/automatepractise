package testngpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title {

	public WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void VerifyTitle() {
		String Expectedtitle = "Swag Labs";

		String actualTitle = driver.getTitle();

		if (Expectedtitle.equals(actualTitle)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
