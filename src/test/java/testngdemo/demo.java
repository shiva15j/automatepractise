package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	WebDriver driver;

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Execuitng before the suite");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("executing before test");
	}

	@BeforeClass
	public void beforeclass() {

		System.out.println("Executing before the class");
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void Verifyurl() {
		String expectedUrl = "https://www.saucedemo.com/";

		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Correct url");
		} else {
			System.out.println("Incorrect url");
		}

	}

	@Test(priority = 2)
	public void VerifyTitle() {
		String expectedtitle = "Swag Labs";

		String actualtitle = driver.getTitle();
		if (expectedtitle.equals(actualtitle)) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title");
		}
	}
	
	@Test(priority = 3)
	public void getPagesource() {
		String source=driver.getPageSource();
		System.out.println(source);
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

	@AfterClass
	public void afterclass() {
		System.out.println("Executing after the class");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("Executing after test");
	}

	@AfterSuite
	public void aftersuite() {

	}

}
