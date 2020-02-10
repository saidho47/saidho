package Session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandelIframe {
	
	
	@Test
	public void handleIframe () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(3000);
		
		
		
		driver.switchTo().frame("packageListFrame");
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("java.sql")));
		
		driver.findElement(By.linkText("java.applet")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.linkText("AudioClip")).click();
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
		
	}
  
}
