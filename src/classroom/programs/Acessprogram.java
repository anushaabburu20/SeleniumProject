package classroom.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acessprogram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monumentbankpa.com/");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		WebElement lnkPersonalBanking = driver.findElement(By.xpath("//a[text()='Personal Banking']"));
		WebElement lnkOnlineBanking = driver.findElement(By.xpath("//ul[@id='menu-top_nav-1']//a[text()='Personal Banking']/following::a[text()='Online Banking']"));
		Thread.sleep(1000);
		act.moveToElement(lnkPersonalBanking).build().perform();
		lnkOnlineBanking.click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}

}
