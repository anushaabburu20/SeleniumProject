package testng.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReportingDemo {
	
	//@Test
	public void anusha() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);  //static wait or hard coded wait
		
		String search = "shopping in dallas airport terminal a";
		
		//WebElement txtSearchBox = driver.findElement(By.name("q"));
		//txtSearchBox.sendKeys(search);
		driver.findElement(By.name("q")).sendKeys(search);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
	

}