package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class radio {
	public static void main(String[] args) throws InterruptedException {
		
	String url= "https://www.demo.guru99.com/test/radio.html";
	WebDriver driver= driverchrome.getDriver(url);
	
	driver.findElement(By.id("vfb-7-1")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("vfb-7-2")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("vfb-7-3")).click();
	
	}
}
