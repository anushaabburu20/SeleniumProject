package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginprogram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.walmart.com");
		Thread.sleep(2000);
		String account = "Account";
		WebElement btnAccount = driver.findElement(By.xpath("//span[text()='Account']"));

		Actions action = new Actions(driver);
		action.moveToElement(btnAccount).build().perform();
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		String Signin = "sign in";
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		Thread.sleep(2000);
		String Emailaddress = "madhu.abburu@gmail.com";
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Emailaddress);
		Thread.sleep(2000);
		String Password = "vishnu14";
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		Thread.sleep(2000);
		String Signin1 = "Sign In";
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);

		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
