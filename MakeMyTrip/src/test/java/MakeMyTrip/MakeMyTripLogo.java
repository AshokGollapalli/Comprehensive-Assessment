package MakeMyTrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTripLogo {

	public static void main(String[] args) throws InterruptedException {
		
		// Calling Firefox WebDriver
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\MakeMyTrip\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		// Maximizing window
		  driver.manage().window().maximize(); 
		  
		// open URL
		  driver.get("https://www.makemytrip.com/");
		
		  Thread.sleep(5000);
		  
		 boolean logoText = driver.findElement(By.xpath("//*[@class='mmtLogo makeFlex']")).isDisplayed();
		// Verifying logo text if it is present print as logo is present
		  if(logoText == true) {
			  System.out.println("logo is present");
		  }else {
			  System.out.println("logo is not present");
		  }
		  
		 
	}
	
}
