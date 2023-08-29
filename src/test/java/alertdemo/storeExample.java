package alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class storeExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);

		// Handling the alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.findElement(By.id("cartur")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Shivam");
		Thread.sleep(2000);
		driver.findElement(By.id("country")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.id("city")).sendKeys("Noida");
		Thread.sleep(2000);
		driver.findElement(By.id("card")).sendKeys("Hdfc");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("August");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
