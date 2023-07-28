package com.SDET.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class eBayAdvsearchPage_Elements {
	WebDriver driver;
	
	@FindBy(id="gh-as-a") public WebElement advSearchBtn; 
	@FindBy(xpath = "//button[@type = 'submit']") public WebElement submitBtn;
	@FindBy(id="gh-logo") public WebElement logo;
	@FindBy(id="_nkw") public WebElement  searchKey;
	@FindBy(xpath = "//button[@type = 'submit']") public WebElement advSubmtBtn;
	@FindBy(xpath="//select[@name= '_sacat']/option") public List<WebElement> categoryOptions;
	
	public eBayAdvsearchPage_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
