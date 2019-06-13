package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        Thread.sleep(5000);
        driver.close();
        driver.quit();
        
        
        

	}

	
		
	}


