package logindemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logindemo {
	WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.out.println("In before test");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("in Before class");
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		System.out.println("in before method");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@Test
	public void Login() throws InterruptedException {
		System.out.println("in test method");
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
		System.out.println("in after method");
		Thread.sleep(2000);
		driver.close();
	}

	@AfterClass
	public void afterclass() {
		System.out.println("In in after class");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("After test");
	}

}
