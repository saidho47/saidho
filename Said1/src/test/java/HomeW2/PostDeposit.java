package HomeW2;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PostDeposit {

	@Test
	public void FindAddDepositButtonOnDashboard() throws InterruptedException {
		// Set Chrome as default browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// Open Chrome Browserd
		WebDriver driver = new ChromeDriver();
		// Go to TechFios Website
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		// Verifty Title Match
		driver.getTitle().contains("Login - TechFios Test Application - Billing");
		// Type username in the username field
		driver.findElement(By.name("username")).sendKeys("techfiosdemo@gmail.com");
		// Type password in the password field
		driver.findElement(By.name("password")).sendKeys("abc123");
		// Incorporate implicit wait or Thread.sleep
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		// Click on Sign In button
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.close();
	

		//Verifty Title Match
		driver.getTitle().contains("Dashboard- Techfios Test Application - Billing");
		driver.findElement(By.xpath(("//*[@id=\"side-menu\"]/li[3]/a")));
			
	}
			
			
}		
			
			
			
		


