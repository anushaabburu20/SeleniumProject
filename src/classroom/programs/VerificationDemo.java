package classroom.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		WebDriver driver=  new ChromeDriver();
		driver.get("http://www.google.com");
		//driver.findElement(By.xpath("//a[text()='About']")).click();
		driver.findElement(By.partialLinkText("About")).click();
		
		
		Thread.sleep(3000);
		//Verify that About page is displayed
		String aboutPage = "About | Google";
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals(aboutPage)) {
			System.out.println("About page is successfully displayed");
		}else
		{
			System.out.println("About page is not successfully displayed");
		}
		
		driver.close();
		driver.quit();

	}

}
