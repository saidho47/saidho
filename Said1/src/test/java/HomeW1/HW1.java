package HomeW1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	
	@Test
	public void validUsersShouldBeAbleToLogIn() throws InterruptedException {
	//Set Chrome as default browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//Open Chrome Browserd
	WebDriver driver = new ChromeDriver();
	//Go to TechFios Website
	driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	//Verifty Title Match
	driver.getTitle().contains("Welcome: Mercury Tours");
	//Type username in the username field
	driver.findElement(By.name("userName")).sendKeys("mercury");
	//Type password in the password field
	driver.findElement(By.name("password")).sendKeys("mercury");
	//Incorporate implicit wait or Thread.sleep
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	//Click on Sign In button
	driver.findElement(By.name("login")).click();
	Thread.sleep(5000);
	driver.close();
	}

}
