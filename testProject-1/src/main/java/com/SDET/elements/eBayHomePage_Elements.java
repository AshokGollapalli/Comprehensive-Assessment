package com.SDET.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class eBayHomePage_Elements {
	WebDriver driver;
	@FindBy(id="gh-btn") public WebElement searchBtn;
	
	public eBayHomePage_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
