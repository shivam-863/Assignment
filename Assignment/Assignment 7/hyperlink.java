package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hyperlink {
public static void main(String[] args) {
	
	
	String url= "https://demo.guru99.com/test/web-table-element.php";
	WebDriver driver= driverchrome.getDriver(url);
	List<WebElement> hyp= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	System.out.println(hyp.size());


}
}
