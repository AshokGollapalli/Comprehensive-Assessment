package com.SDET;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class eBayAdvancedSearchSanity {
	WebDriver driver;
  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\testProject-1\\msedgedriver.exe");
	  driver = new EdgeDriver();
	  driver.get("https://www.ebay.com/");
  }
  @AfterMethod
  public void tearDown() {
	  driver.close();
  }
  @Test
  public void advancedSearch() {
	  driver.findElement(By.id("gh-as-a")).click();
	  driver.findElement(By.xpath("//button[@type = 'submit']")).click();
  }
  @Test 
  public void allCategories() {
	  List<WebElement> categoryOptions = driver.findElements(By.xpath("//select[@name= '_sacat']/option"));
	  List<String> arr1 = new ArrayList<String>(); 	  
	  for (WebElement cOptns:categoryOptions) {
		  arr1.add(cOptns.getText());
	  }
	  List<String> arr2 = new ArrayList<String>(arr1); 	 
	  Collections.sort(arr2);
	  System.out.println(arr1);
	  System.out.println(arr2);
	  Assert.assertEquals(arr1.equals(arr2),"checking sorted list ");
  }
  
}
