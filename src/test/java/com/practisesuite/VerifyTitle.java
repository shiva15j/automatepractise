package com.practisesuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {

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
	public void Verifytitle() throws InterruptedException {
		

		String expectedTitle = "Swag Labs";

		String actualtitle = driver.getTitle();

		if (expectedTitle.equals(actualtitle)) {
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
