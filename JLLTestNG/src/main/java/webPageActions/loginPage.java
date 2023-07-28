package webPageActions;

import org.openqa.selenium.WebDriver;

import webPage_Elements.loginPage_Elements;

public class loginPage {
	WebDriver driver;
	
	loginPage_Elements loginPage_Elements_pages;
	 
	public loginPage(WebDriver driver) {
		this.driver = driver;
		
		loginPage_Elements_pages = new loginPage_Elements(driver);
	}
	public void clickLoginBtn() {
		loginPage_Elements_pages.loginButn.click();
	}
	public String logoText() {
		return(loginPage_Elements_pages.loginlogo.getText());
	}
	public void userName() {
		loginPage_Elements_pages.userName.sendKeys("standard_user");
	}
	public void passWord() {
		loginPage_Elements_pages.password.sendKeys("secret_sauce");
	}
	
}
