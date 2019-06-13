package classroom.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class storeprogram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		WebDriver driver=  new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.partialLinkText("Store")).click();
		
		String aboutPage = "Google Store for Google Made Devices & Accessories";
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals(aboutPage)) {
			System.out.println("Store page is successfully displayed");
		}else
		{
			System.out.println("Store page is not successfully displayed");
		
		}
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
