package com.lib;

import org.openqa.selenium.WebDriver;

public class FlowLib {
	private WebDriver driver;
	
	public FlowLib(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToURL(String URL) {
		this.driver.get(URL);
	}
	
	public String getTitle() {
		return(this.driver.getTitle());
	}
	public String getCurntURL() {
		return(this.driver.getCurrentUrl());
	}

}
