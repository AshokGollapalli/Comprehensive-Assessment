package webPage_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_Elements {
	WebDriver driver;
	@FindBy(id="user-name") public WebElement userName;
	@FindBy(id="password") public WebElement password;
	@FindBy(id="login-button") public WebElement loginButn;
	@FindBy(className="login_logo") public WebElement loginlogo;
	
	public loginPage_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
