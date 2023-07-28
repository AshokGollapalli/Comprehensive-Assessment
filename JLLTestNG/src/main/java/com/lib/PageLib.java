package com.lib;

import org.openqa.selenium.WebDriver;

import webPageActions.cartPages;
import webPageActions.homePage;
import webPageActions.loginPage;

public class PageLib {
	private WebDriver driver;
	//Objects declaration
	private cartPages cartPage;
	private homePage homePages;
	private loginPage loginPages;
	public PageLib(WebDriver driver) {
		this.driver = driver;
		//objects instantiation
		homePages = new homePage(this.driver);
		cartPage = new cartPages(this.driver);
		loginPages = new loginPage(this.driver);
	}
	public cartPages cartPagePL() {
		return cartPage;
	}
	public homePage homePagesPL() {
		return homePages;
	}
	public loginPage loginPagesPL() {
		return loginPages;
	}
}
