package com.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandledemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// String windowid = driver.getWindowHandle();

		// System.out.println(windowid);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Thread.sleep(2000);

		Set<String> windowid = driver.getWindowHandles();

		List<String> windowlist = new ArrayList<String>(windowid);

		String pwindow = windowlist.get(0);
		System.out.println("Parent window=:" + pwindow);
		Thread.sleep(2000);
		String childwindow = windowlist.get(1);
		System.out.println("child window=" + childwindow);

		Thread.sleep(2000);
		driver.switchTo().window(pwindow);
		System.out.println("The title of the current page is=:" + driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(childwindow);
		System.out.println("The title of the current page is=:" + driver.getTitle());

		Thread.sleep(2000);
		driver.quit();
	}

}
