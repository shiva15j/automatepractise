package dropdownpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://blazedemo.com/");

		WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));

		Select drp = new Select(ele);
		drp.selectByValue("Boston");

		Thread.sleep(2000);
		driver.close();

	}

}
