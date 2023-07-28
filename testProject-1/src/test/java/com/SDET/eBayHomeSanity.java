package com.SDET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SDET.app.Pages.eBayHomePage_Page;

public class eBayHomeSanity {
	WebDriver driver;
	eBayHomePage_Page homePage = new eBayHomePage_Page(driver);
	

	@BeforeMethod()
	public void setup() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\testProject-1\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		//homePage = new eBayHomePage_Page(driver);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void empty_Search_test() {

		String title = "Shop by Category | eBay";
		String URL = "https://www.ebay.com/n/all-categories";
		Assert.assertTrue(homePage.searchBtnIsEnabled(), "verifieng search button");
		// Assert.assertFalse(driver.findElement(By.id("gh-btn")).isEnabled(),
		// "verifieng search button");
		// Assert.assertNull(title, URL);
		// Assert.assertNotNull(title, URL);
		homePage.clickSearchBtn();

		String URLse = driver.getCurrentUrl();
		String titleSe = driver.getTitle();
		System.out.println(titleSe);
		System.out.println(URLse);
		Assert.assertEquals(title, URLse, "Verify titles of new page");
		Assert.assertEquals(URL, URLse, "Verify URLs of new page");
		// Assert.assertNotEquals(URLse, titleSe,"");

	}

	@Test
	public void softAssert() {
		
		SoftAssert SA = new SoftAssert();
		String title = "Shop by Category | eBay";
		String URL = "https://www.ebay.com/n/all-categories";
		SA.assertTrue(homePage.searchBtnIsEnabled(), "verifieng search button");
		// Assert.assertFalse(driver.findElement(By.id("gh-btn")).isEnabled(),
		// "verifieng search button");
		// Assert.assertNull(title, URL);
		// Assert.assertNotNull(title, URL);
		homePage.clickSearchBtn();

		String URLse = driver.getCurrentUrl();
		String titleSe = driver.getTitle();
		System.out.println(titleSe);
		System.out.println(URLse);
		SA.assertEquals(title, URLse, "Verify titles of new page");
		SA.assertEquals(URL, URLse, "Verify URLs of new page");
		// Assert.assertNotEquals(URLse, titleSe,"");
		SA.assertAll();
	}
}
