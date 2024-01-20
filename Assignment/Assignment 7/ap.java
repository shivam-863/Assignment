package kp.ak;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ap {

	WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		String url="https://insydegst.in/login";
		driver= driverchrome.getDriver(url);
			
	}
	
	
	
	
	@Test(dataProvider = "dp")
	public void login(String email,String pass) throws InterruptedException {
	WebElement emailele = driver.findElement(By.id("username"));
	emailele.clear();
	emailele.sendKeys(email);
	Thread.sleep(2000);
	
	WebElement passele = driver.findElement(By.id("password"));
	passele.clear();
	passele.sendKeys(pass);
	Thread.sleep(2000);
	}	
	@DataProvider(name= "dp") 
	public static Object[][] getdata(){
		Object[][] obj = new Object[3][2];
		
		obj[0][0]= "nadiad@gmail.com";
		obj[0][1]= "nadiad@123";
		
		obj[1][0]= "anand@gmail.com";
		obj[1][1]= "anand@123";
		
		obj[2][0]= "kheda@gmail.com";
		obj[2][1]= "kheda@123";
		
		return obj;
		
	}
	
	}

