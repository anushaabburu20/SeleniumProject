package features;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
	WebDriver driver=  new ChromeDriver();
	driver.get("http://www.google.com");
	Thread.sleep(1000);
	String search = "Shoping in dallas";
	driver.findElement(By.name("q")).sendKeys(search);
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	Thread.sleep(3000);
	driver.close();
	driver.quit();
	}

}
