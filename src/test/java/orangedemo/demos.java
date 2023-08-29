package orangedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demos {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@Test
	public void login() throws InterruptedException  {

		driver.findElement(By.name("username")).sendKeys("Admin");

		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("admin123");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
	}

	
	@Test
	public void addemployee() {
		
		
		
		
	}
	
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
