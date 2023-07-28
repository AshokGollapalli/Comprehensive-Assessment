package com.SDET.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class eBaySearchResults_Elements {
	WebDriver driver;
	@FindBy(xpath="x-refine__item") public WebElement category;
	public eBaySearchResults_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

}
