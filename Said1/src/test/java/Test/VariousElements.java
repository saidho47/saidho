package Test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousElements {
	
	
	@Test
	public void exploreVariousElements() throws InterruptedException {
	//set chrome Driver as your default Driver
		System.setProperty("webdriver.com.driver", "/Said1/driver/chromedriver.exe");
		
	//Instantiate chchromeDriver object 
		WebDriver driver = new ChromeDriver();
	
	// Implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// Delete cookies and hostory
		driver.manage().deleteAllCookies();
	// Go to Site
		driver.get("http://objectspy.space/");
	//Slow down Java 1000ms= 1sc
		
		Thread.sleep(3000);
	//Click on Radio Button Male
		
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(3000);
		
	//type something on field 
		driver.findElement(By.name("")).sendKeys("");
		
	//click on link text
		driver.findElement(By.linkText("Link Test: New Page")).click();
		Thread.sleep(3000);
		
	//click on partial link 
		driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();
		Thread.sleep(3000);
		
	//	
	}
}
