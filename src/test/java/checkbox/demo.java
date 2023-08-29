package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id ,'days')]"));

		//System.out.println(ele.size());

		for (WebElement checkbox : ele) {
			Thread.sleep(2000);
			String obj = checkbox.getAttribute("id");
			//System.out.println(obj);
			if (obj.equals("monday") || obj.equals("tuesday")) {

				checkbox.click();
			}
		}

		Thread.sleep(2000);
		driver.close();
	}

}
