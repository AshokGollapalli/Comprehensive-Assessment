package webPage_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage_Elements {
	WebDriver driver;
	@FindBy(xpath="//*[@class='shopping_cart_container']") public WebElement cartIcon;
	@FindBy(xpath="//*[contains(text(),'Your Cart')]") public WebElement cartTitle;
	@FindBy(id="continue-shopping") public WebElement cntnShopingButn;
	@FindBy(id="checkout") public WebElement checkoutBtn;
	
	public cartPage_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
