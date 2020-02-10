package Session4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {
	
	WebDriver driver;

	@Test
	public void HoverOver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us/work/shop/deals/performance-deals?~ck=mn");
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Financing"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.linkText("Pay Bill & Manage Account"))).build().perform();
		driver.findElement(By.linkText("Pay Bill & Manage Account")).click();
		Thread.sleep(5000);
	};
	
	
	 @After
	 public void closeEvryThing() { 
		 driver.close();
		 driver.quit();
		 }
	 
}
