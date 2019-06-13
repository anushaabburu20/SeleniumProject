
package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		// Selenim WebDriver software
		// browser driver software (Ex: Chrome, Firefox, Edge, Internet explorer, safari)
		System.setProperty("webdriver.chrome.driver", "/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
		
		

	}

}
