package features;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class targetprogram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/anushaabburu/eclipse-workspace/SeleniumProject/BrowserDrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.target.com");
		Thread.sleep(2000);
		String Signin = "account";
		WebElement btnAccount = driver.findElement(By.xpath("//a[@id='account']"));
		btnAccount.click();
		Thread.sleep(2000);
		String Signin1 = "Sign in";
		driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		Thread.sleep(2000);
		String Emailormobilephone = "6692358165";
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Emailormobilephone);
		Thread.sleep(2000);
		String Password = "tejashri";
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		Thread.sleep(2000);
		//String keepmesignedin = "checkbox";
		//driver.findElement(By.xpath("//input[@type='KeepMeSignedIn']")).click();
		//Thread.sleep(2000);
		String Signin2 = "Sign in";
		driver.findElement(By.xpath("//button[text()='Sign in']")).sendKeys(Signin2);
		Thread.sleep(2000);
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

		
	}

