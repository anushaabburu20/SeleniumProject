package features;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class macys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.macys.com");
		Thread.sleep(2000);
		String search = "toys";
			driver.findElement(By.name("keyword")).sendKeys(search);
			Thread.sleep(2000);
			driver.findElement(By.name("keyword")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.close();
			driver.quit();

	}

}
