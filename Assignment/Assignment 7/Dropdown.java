package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) {
	
	
	String url= "https://demo.guru99.com/test/newtours/register.php";
	WebDriver driver= driverchrome.getDriver(url);
	WebElement cname = driver.findElement(By.name("country"));
	Select ddown= new Select(cname);
	ddown.selectByVisibleText("CUBA");
	
}
}
