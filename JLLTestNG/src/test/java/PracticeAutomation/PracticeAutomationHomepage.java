package PracticeAutomation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class PracticeAutomationHomepage {
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
  public void HomePage() {
	  
	 WebElement logo = driver.findElement(By.xpath("//*[@alt='Automation Practice Site']"));
	 String logoText = logo.getText();
	 System.out.println("Logo Text :"+logoText);
	 List<WebElement> BannerList = driver.findElements(By.id("main-nav"));
	  for(int i=0;i<BannerList.size();i++)
	  {
		  System.out.println(BannerList.get(i).getText());
		 
	  }
  }
 @Test(priority=3)
 public void SubscrieHere() {
	  WebElement SubscribeText = driver.findElement(By.id("mc4wp_form_widget-2"));
	 SoftAssert sa = new SoftAssert();
	 sa.assertTrue(SubscribeText.isDisplayed(),"Subscribe Here text is appearing ");
	 driver.findElement(By.name("EMAIL")).sendKeys("xyyz@gmail.com");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 System.out.println("after click on subscribe button following message is displaying "+driver.findElement(By.xpath("//p[contains(text(),'sign-up')]")).getText());
 }
 @Test(priority=2)
 public void logo() {
	List<WebElement> logoSocialLinks = driver.findElements(By.xpath("//div[@class='widget themify-social-links']//li"));
	
		System.out.println("Number of social links available under logo "+logoSocialLinks.size());
	
 }

  

}
