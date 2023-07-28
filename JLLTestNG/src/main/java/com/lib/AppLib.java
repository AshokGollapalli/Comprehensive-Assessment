package com.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {
	private WebDriver driver;
	private PageLib pageLibrary;
	private FlowLib flowLibrary;
	public AppLib(WebDriver driver) {
		this.driver =driver;
		pageLibrary = new PageLib(this.driver);
		flowLibrary = new FlowLib(this.driver);
	}
	
	public PageLib Page() {
	return pageLibrary;
	}
	public FlowLib flowLib1() {
		return flowLibrary;
	}
}
