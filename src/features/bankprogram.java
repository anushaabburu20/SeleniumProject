package features;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bankprogram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monumentbankpa.com/");
		Thread.sleep(2000);
		WebElement lblBusinessBanking = driver.findElement(By.xpath("//a[text()='Business Banking']"));
		Actions action = new Actions(driver);
		action.moveToElement(lblBusinessBanking).build().perform();
		Thread.sleep(500);
		WebElement lblpersonal = driver.findElement(By.xpath("//a[text()='Personal Banking']"));
		
		//Actions action1 = new Actions(driver);
		action.moveToElement(lblpersonal).build().perform();
		Thread.sleep(2000);
		List<WebElement> lblonlinebanking =driver.findElements(By.xpath("//a[text()='Online Banking']"));
		System.out.println(lblonlinebanking.get(1).isDisplayed());
		lblonlinebanking.get(1).click();
		//action.moveToElement(lblonlinebanking);
		//action.click();
		//action.perform();
		//action.click(lblonlinebanking).build().perform();
		//lblonlinebanking.click();
		//Actions action3 =new Actions(driver);
		//action.moveToElement(lblonlinebanking).build().perform();
		Thread.sleep(1000);
		driver.close();
		driver.quit();

	}

}