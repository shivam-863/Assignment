package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alert {
public static void main(String[] args) throws InterruptedException {
		
	String url= "https://demoqa.com/alerts";
	WebDriver driver= driverchrome.getDriver(url);
//	String alerttitle = driver.getTitle();
	System.out.println(driver.getTitle());
	WebElement alrtbtn =  driver.findElement(By.id("alertButton"));
	alrtbtn.click();
	Thread.sleep(2000);
	Alert s1= driver.switchTo().alert();
	s1.accept();
	
	
	
	
	
	}
}
