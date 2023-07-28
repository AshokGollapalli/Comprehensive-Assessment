package PracticeAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Shop {
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
		  //driver.close();
	  }
  @Test(enabled=false)
  public void openShop() throws InterruptedException {
	  
	  WebElement n=driver.findElement(By.linkText("Shop"));
	  JavascriptExecutor j = (JavascriptExecutor) driver;
	  j.executeScript("arguments[0].click();", n);
	  //driver.findElement(By.id("aswift_7")).
	  driver.switchTo().frame("aswift_7");
	  Thread.sleep(5000);
	  
//	  Alert alert = driver.switchTo().alert();
//	  	System.out.println(alert.getText());
//		 alert.dismiss();
//	  Thread.sleep(5000);
	 WebElement slideBar = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
	  Actions action = new Actions(driver);
	  //WebElement xInit = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
	  //WebElement xGoal = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default'][2]")).;
	  action.dragAndDropBy(slideBar, 270,0).perform();
	  driver.findElement(By.xpath("//*[@class='button']")).click();
	  
  }
  @Test
  public void itemsPage() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[@class='wpmenucart-contents empty-wpmenucart-visible']")).click();
	  
	  Thread.sleep(10000);

	 WebElement slideBar = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
	  Actions action = new Actions(driver);
	  //WebElement xInit = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
	  //WebElement xGoal = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default'][2]")).;
	  action.dragAndDropBy(slideBar,20,0).perform();
	  driver.findElement(By.xpath("//*[@class='button']")).click();
	  
  }

}
