package webPageActions;

import org.openqa.selenium.WebDriver;

import webPage_Elements.cartPage_Elements;

public class cartPages {
	WebDriver driver;
	cartPage_Elements cartPages;
	public cartPages(WebDriver driver) {
		this.driver = driver;
		cartPages = new cartPage_Elements(driver);
	}
	public void cartLinkClick() {
		
		cartPages.cartIcon.click();
		
	}
	public String cartPageTitle() {
		return(cartPages.cartTitle.getText());
	}
	public Boolean verifyCntnBtn() {
		return(cartPages.cntnShopingButn.isDisplayed());
	}
	
	public Boolean verifyCheckoutBtn() {
		return(cartPages.checkoutBtn.isDisplayed());
	}

}
