package PracticeAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyAccountPage {
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\JLLTestNG\\msedgedriver.exe");
		  driver = new EdgeDriver();
		  driver.get("https://practice.automationtesting.in/");
		  driver.manage().window().maximize();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Thread.sleep(2000);
	  }
	  
	  @AfterMethod
	  public void TearDownMethod() throws InterruptedException {
		  Thread.sleep(2000);
		  driver.close();
	  }
	
	 @Test(priority=1)
	 public void MyAccountPageTest() throws InterruptedException {
		 SoftAssert sa= new SoftAssert();
		 driver.findElement(By.id("menu-item-50")).click();
		/* Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.dismiss();*/
		 //driver.findElement(By.xpath("//*[@role='button']")).click();
		 String Title = driver.getTitle();
		 String TitleManual = "Automation Practice Site";
		 System.out.println(Title);
		  
		 sa.assertEquals(Title, TitleManual,"Verify Title of New Page");
		 Thread.sleep(5000);
		 
		 sa.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Login')]")).isDisplayed());
		 sa.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Register')]")).isDisplayed(),"Register section is displaying");
		 sa.assertAll();
	 }
	 @Test(priority=2)
	 public void registerValidation() throws InterruptedException {
		 driver.findElement(By.id("menu-item-50")).click();
//		 Thread.sleep(2000);
//		 Alert alert = driver.switchTo().alert();
//		 System.out.println(alert.getText());
//		 alert.dismiss();
		 driver.findElement(By.xpath("//*[@name='register']")).click();
		 System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Please provide a valid email address.')]")).getText());
	 }
}
