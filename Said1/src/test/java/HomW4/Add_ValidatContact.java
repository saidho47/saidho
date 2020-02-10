package HomW4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Add_ValidatContact {

	WebDriver driver;

	@Test
	public void AccessTechFiosPlatform() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver(); //
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");

		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//*[contains(@placeholder,'assword')and contains(@class,'form-')]"))
				.sendKeys("abc123");
		driver.findElement(By.xpath("//button")).click();
		String expectedTitle = "Dashboard- TechFios Test Application - Billing";
		Assert.assertEquals(driver.getTitle(), expectedTitle, "Dashboard Page did not display!");
	}
	
	

	
	public void AddAccount() {

		By CRM_MENU_LOCATOR = By.xpath("//a[@href='#']");
		By AddAccount_Locator = By.xpath("//*[@id='side-menu']/li[2]/ul/li[1]/a)");
		driver.findElement(CRM_MENU_LOCATOR).click();
		waitForElement(AddAccount_Locator, driver, 20);

		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//*[contains(@placeholder,'assword')and contains(@class,'form-')]"))
				.sendKeys("abc123");
		driver.findElement(By.xpath("//button")).click();

	}

	private void waitForElement(By AddAccount_Locator, WebDriver driver2, int time) {
		new WebDriverWait(driver2, time).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AddAccount_Locator));

	}

	
	public void ValidatAccount() {

	}

	
	public void closeEvryThing() {
		driver.close();
		driver.quit();
	}
}
