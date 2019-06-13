package features;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com");
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-DD_mm-ss");
		Date date= new Date(0);
		System.out.println(dateformat.format(date) );
		
		

	}

}
