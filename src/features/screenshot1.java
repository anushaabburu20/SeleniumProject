package features;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screenshot1 {

		public static void main(String[] args) throws IOException, InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://jcpenney.com");
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
			Date date = new Date(0);
			System.out.println(dateFormat.format(date));
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("/Users/anushaabburu/Downloads/acct_"+ dateFormat.format(date)  +".png"));
			 
			WebElement InkSignIn = driver.findElement(By.id("cart"));
			
			System.out.println(InkSignIn.isDisplayed());
			Thread.sleep(3000);
		    Actions action = new Actions(driver);
		    action.moveToElement(InkSignIn).build().perform();
		    Thread.sleep(4000);
		    driver.close();
			driver.quit();

	}

}
