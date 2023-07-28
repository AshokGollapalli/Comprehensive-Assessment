package webPage_Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage_Elements {
	WebDriver driver;
	@FindBy(xpath="//*[@class='inventory_item_name']") public List<WebElement> list;
	@FindBy(xpath= "//*[@class='shopping_cart_link']") public WebElement cartIcon;
	
	
	public homePage_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
