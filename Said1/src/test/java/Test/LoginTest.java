package Test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LoginTest {

	@Test
	public void ValidUserShouldAbleToLogeIn() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Said\\eclipse-workspace\\Said1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//*[contains(@placeholder,'assword')and contains(@class,'form-')]")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[contains(@text,'sign')")).click();
		Thread.sleep(3000);
		
		String dashboardTitleXpath ="//div[@id='page-wrapper']//descendant::h2[contains(text(), 'Dashboa')]";
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String ExpectedTitle = "Dashboard-Techfios Test Application - Billing";
		String actuelTitle = driver.getTitle();
		if(ExpectedTitle.equalsIgnoreCase(actuelTitle )) {
			System.out.println("Test Pass");
			
		}
		else{
			System.out.println("Dashboard Page did not display");
	
		
		throw new RuntimeException("test failed!");
		}
		 
		Assert.assertEquals(expected, actual);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(dashboardTitleXpath)));
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

	private void eles(Object println) {
		// TODO Auto-generated method stub
		
	};
}