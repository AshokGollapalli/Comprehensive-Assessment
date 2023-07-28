package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTripLogo {

	public static void main(String[] args) throws InterruptedException {
		
		 //System.setProperty("webdriver.gecko.driver","C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\JLLTestNG\\geckodriver.exe");
		 //WebDriver driver = new FirefoxDriver();
		 
		 System.setProperty("webdriver.edge.driver","C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\JLLTestNG\\msedgedriver.exe"); 
				 WebDriver driver = new EdgeDriver(); 
				 driver.manage().window().maximize();
		  driver.get("https://www.makemytrip.com/");
		  driver.manage().window().maximize();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Thread.sleep(5000);
		  
		 /* boolean logoText = driver.findElement(By.xpath("//*[@class='mmtLogo makeFlex']")).isDisplayed();
		  if(logoText == true) {
			  System.out.println("logo is present");
		  }else {
			  System.out.println("logo is not present");
		  }*/
		  
		  //driver.findElement(By.linkText("Hotels")).click();
		  //driver.findElement(By.xpath("//*[@class='tabsCircle appendRight5']")).click();
		  WebElement iframe = driver.findElement(By.xpath("//*[@title='notification-frame-173062137']"));
		  
		  driver.switchTo().frame(iframe);
		 
		  driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		 Thread.sleep(5000);
		  driver.switchTo().defaultContent();
		  //Thread.sleep(5000);
		  System.out.println("hi"+driver.findElement(By.xpath("//*[@class='mmtLogo makeFlex']")).getText());
		  
		  driver.findElement(By.xpath("//*[@class='lbl_input appendBottom10']")).click();
		  //driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys("Hyderabad");
		 // Thread.sleep(5000);
		  
		  //driver.findElement(By.xpath("//*[@class='font14 appendBottom5 blackText']")).click();
		  List<WebElement> List = driver.findElements(By.xpath("//*[@class='font14 appendBottom5 blackText']"));
		  
		  for(int i=0;i<List.size();i++) {
			  if(List.get(i).getText().equalsIgnoreCase("Hyderabad, India")) {
				  driver.findElement(By.xpath("(//*[@class='font14 appendBottom5 blackText'])["+(i+1)+"]")).click();
			  }
			  System.out.println(List.get(i).getText());
			  
		  }
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("(//*[@class='lbl_input appendBottom10'])[2]")).click();
		  for(int i=0;i<List.size();i++) {
			  if(List.get(i).getText().equalsIgnoreCase("Mumbai, India")) {
				  driver.findElement(By.xpath("(//*[@class='font14 appendBottom5 blackText'])["+(i+1)+"]")).click();
			  }
		  }
	}
	
}
