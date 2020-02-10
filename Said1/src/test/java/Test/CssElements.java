package Test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssElements {

	@Test
	public void HandelCssElements() throws InterruptedException {

		System.setProperty("webdriver.com.driver", "/Said1/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://objectspy.space/");
		Thread.sleep(3000);
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(3000);
		// type something on field
		driver.findElement(By.name("")).sendKeys("");

		// click on link text
		driver.findElement(By.linkText("Link Test: New Page")).click();
		Thread.sleep(3000);

		// click on partial link
		driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();
		Thread.sleep(3000);

		//
	};
}
