package alertdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();

		Alert alert = driver.switchTo().alert();

		Thread.sleep(2000);
		alert.sendKeys("123");
		Thread.sleep(2000);
		alert.accept();

		Thread.sleep(2000);
		driver.close();

	}

}
