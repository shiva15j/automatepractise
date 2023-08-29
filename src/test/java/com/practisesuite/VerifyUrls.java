package com.practisesuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyUrls {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void VerifyUrl() throws InterruptedException {
		

		String expectedUrl = "https://www.saucedemo.com/";

		String actualUrl = driver.getCurrentUrl();

		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Correct Url");
		} else {
			System.out.println("Incoorect Url");
		}

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
