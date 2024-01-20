package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseevent {
	public static void main(String[] args) throws InterruptedException {
		String url= "https://www.myntra.com/";
		WebDriver driver = driverchrome.getDriver(url);
		
		WebElement woman = driver.findElement(By.className("desktop-main"));
		WebElement man = driver.findElement(By.className("desktop-main"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		Action a1= action.moveToElement(woman).build();
		a1.perform();
		Thread.sleep(2000);
		Action a2 = action.moveToElement(man).build();
		a2.perform();
		
		
		
		
	
	
	
	}

}
