package SauceLab;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import webPageActions.cartPages;
import webPageActions.homePage;
import webPage_Elements.cartPage_Elements;
import webPage_Elements.homePage_Elements;
import webPage_Elements.loginPage_Elements;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class cartPage extends AbstractBaseTest{
	

	
  @Test(priority=1,groups ={"p0"})
  public void cartPge() throws InterruptedException {
	  Thread.sleep(1000);
	  App().flowLib1().navigateToURL("https://www.saucedemo.com/");
	  Thread.sleep(2000);
	  
	  App().Page().loginPagesPL().userName();
	  App().Page().loginPagesPL().passWord();
	  App().Page().loginPagesPL().clickLoginBtn();
		
	  App().Page().cartPagePL().cartLinkClick();
	  SoftAssert sa = new SoftAssert();
	  Thread.sleep(1000);
	  String URL = "https://www.saucedemo.com/cart.html";
	  String actualURL = App().flowLib1().getCurntURL();
	  
	  sa.assertEquals(URL, actualURL, "URLs are similar");
	  
	  sa.assertAll();
  }
  @Test(priority=2,enabled=true,groups ={"p0"})
  public void verifyCartPage() throws InterruptedException {
	  App().flowLib1().navigateToURL("https://www.saucedemo.com/");
	  Thread.sleep(2000);
	  App().Page().loginPagesPL().userName();
	  App().Page().loginPagesPL().passWord();
	  App().Page().loginPagesPL().clickLoginBtn();
	  App().Page().homePagesPL().cartIconLink();
	  SoftAssert sa = new SoftAssert();
	  
	  String pageTitle = App().Page().cartPagePL().cartPageTitle();
	  String pageTitleActual = "Your Cart";
	  sa.assertEquals(pageTitle, pageTitleActual,"Page Title is matching");
  }
  
  @Test(priority=3,enabled=true, groups ={"p1"})
  public void verifyButtons() throws InterruptedException {
	  App().flowLib1().navigateToURL("https://www.saucedemo.com/");
	  Thread.sleep(2000);
	  App().Page().loginPagesPL().userName();
	  App().Page().loginPagesPL().passWord();
	  App().Page().loginPagesPL().clickLoginBtn();
	  App().Page().homePagesPL().cartIconLink();
	  SoftAssert sa = new SoftAssert();
	  sa.assertTrue(App().Page().cartPagePL().verifyCntnBtn());
	  sa.assertTrue(App().Page().cartPagePL().verifyCheckoutBtn());
	  sa.assertAll();
  }
  /*@BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\JLLTestNG\\msedgedriver.exe");
	  driver = new EdgeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  driver.close();
  }*/

}
