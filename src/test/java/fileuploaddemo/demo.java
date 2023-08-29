package fileuploaddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\shiva\\Documents\\sample.txt");
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit1")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
