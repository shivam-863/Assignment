package assignment;

import org.openqa.selenium.WebDriver;

public class fbtitle {
public static void main(String[] args) {
	
	
	String url= "https://www.facebook.com/";
	WebDriver driver= driverchrome.getDriver(url);
//	String alerttitle = driver.getTitle();
	System.out.println(driver.getTitle());
	
	
}
}
