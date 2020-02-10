package Session4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandelNewTabe {
	WebDriver driver;

	@Before
	public void LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver(); //
		driver.manage().window().maximize(); 
		// driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");

	}

	@Test
	public void searchXpathInYahoo() {

		By SEARCH_FIELD_LOCATOR = By.cssSelector("input#header-search-input");

		By W3_LINK_LOCATOR = By.linkText("XPath Tutorial - w3schools.com");
		By SQL_LINK_LOCATOR = By.xpath("//*[@id=\"main\"]/div[2]/a[2]");

		driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys("xpath");

		driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys(Keys.ENTER);

		driver.findElement(W3_LINK_LOCATOR).click();

		//System.out.println(driver.getWindowHandle());

		for (String handle: driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			}

		driver.findElement(SQL_LINK_LOCATOR).click();

	}

	
	  @After 
	  public void closeEvryThing() { 
		  driver.close(); 
		  driver.quit(); 
		  }
	 
}
