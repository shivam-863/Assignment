package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partial_link {
	public static void main(String[] args) {
		
	String url= "https://phptravels.com/demo/";
	WebDriver driver= driverchrome.getDriver(url);
	List<WebElement> link= driver.findElements(By.linkText("Demo"));
	System.out.println(link.size());
	link.get(0).click();
	
	
	
	
	
	
	}
}
