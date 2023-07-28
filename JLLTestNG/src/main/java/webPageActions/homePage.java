package webPageActions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webPage_Elements.homePage_Elements;

public class homePage {
	WebDriver driver;
	homePage_Elements homePages;
	public homePage(WebDriver driver) {
		this.driver = driver;
		homePages = new homePage_Elements(driver);
	}
	
	public List<WebElement> homePageList(){
		return(homePages.list);
		
	}
	public void cartIconLink() {
		homePages.cartIcon.click();
	}
}
