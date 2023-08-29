package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url {
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
	public void TestUrl() {
		String actualurl="https://www.saucedemo.com/";
		String expectedurl=driver.getCurrentUrl();
		if(actualurl.equals(expectedurl)) {
			System.out.println("Correct url");
		}
		else {
			System.out.println("Incorrect");
		}
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
