package features;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[@class='Animated Color Scales']")).click();
		Thread.sleep(1000);
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(100);
		rt.keyRelease(KeyEvent.VK_ENTER);
		driver.close();
		driver.quit();
	}

}
