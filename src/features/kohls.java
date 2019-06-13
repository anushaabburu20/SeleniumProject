package features;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kohls {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.kohls.com");
		Thread.sleep(2000);
		String search = "toys";
		driver.findElement(By.name("search")).sendKeys(search);
		Thread.sleep(2000);
		driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id='container']")).isDisplayed();
		if(driver.findElement(By.xpath("//div[@id='container']")).isDisplayed()) {
			System.out.println("toys displayed");

		}else
		{
			System.out.println("toys not displayed");
		}
			
		driver.close();
		driver.quit();
	}

}
