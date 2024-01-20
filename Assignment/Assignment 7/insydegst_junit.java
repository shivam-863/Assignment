package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class insydegst_junit {
	WebDriver driver;
	
	@Before
	 public void browser() {
		 String url="https://insydegst.in/login";
		 driver= driverchrome.getDriver(url);
		 }
	 @Test
	public void login() {
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("pranavgandhi123@gmail.com");
		WebElement pass= driver.findElement(By.className("form-control"));
		pass.sendKeys("pranav@123");
		WebElement login =driver.findElement(By.className("btn"));
		login.click();
		
	}

}
