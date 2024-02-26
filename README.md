package com.qa.testpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class UrbanwoodPages {
	WebDriver driver;

	public UrbanwoodPages(WebDriver rDriver) {
		this.driver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	
	//Searching an item
	@FindBy(xpath="//div[@class=\"CloseBtn\"]")
	WebElement webpopup;
	public WebElement getwebpopup()
	{
		return webpopup;
	}
	@FindBy(id="search-top")
	WebElement searchbar;
	public WebElement getsearchbar() {
		return searchbar;
	}
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement magnifierBtn;
	public WebElement getmagnifierBtn() {
		return magnifierBtn;
	}
	@FindAll(@FindBy(xpath="//p[@class=\"proName\"]"))
	List<WebElement> Allrecommandations;
	public List<WebElement> getAllrecommandations(){
		return Allrecommandations;
	}
	
	@FindBy(xpath="/html/body/div[2]/div/section/div[2]/ul/li[1]/a/figure/img")
	WebElement selectitem;
	public WebElement getselectitem() {
		return selectitem;
	}
	@FindBy(xpath="/html/body/div[2]/section[1]/div[1]/div[1]/svg/path")
	WebElement addwishlist;
	public WebElement getaddwishlist() {
		return addwishlist;
	}
	@FindBy(xpath="/html/body/div[2]/section[1]/div[2]/div[3]/a[1]")
	WebElement addtocart;
	public WebElement getaddtocart() {
		return addtocart;
	}
	
	
	
	//Login Functionality 
	@FindBy(partialLinkText ="Login")
	WebElement Login;
	public WebElement getLogin() {
	    return Login;
	}
	@FindBy(xpath="//body/section[15]/div[2]/div[2]/form[2]/article[1]/div[1]/input[1]")
	WebElement Emailtxtfield;
	public WebElement getEmailtxtfield() {
	    return Emailtxtfield;
	}
	@FindBy(xpath="//input[@id='passinputloginPop']")
	WebElement PasswordtextField;
	public WebElement getPasswordtextField() {
	    return PasswordtextField;
	}
	@FindBy(id="loginPopFormSubmit")
	WebElement Signinbtn;
	public WebElement getSigninbtn() {
	    return Signinbtn;
	}
	
	
	
	
	//Browse Functionality.
	@FindBy(xpath="/html/body/header/nav/ul/li[3]/a")
	WebElement livingroom;
	public WebElement getlivingroom() {
		return livingroom;
	}
	
	@FindBy(xpath="/html/body/header/nav/ul/li[3]/div/div/section/article[1]/ul/li[3]/a")
	WebElement bookshelves;
	public WebElement getbookshelves() {
		return bookshelves;
	}

	@FindBy(xpath="//*[@id=\"input-pincode\"]")
	WebElement pincode;
	public WebElement getpincode() {
		return pincode;
	}	
	@FindBy(xpath="/html/body/div[2]/section[1]/div[2]/div[2]/div/input[2]")
	WebElement checkbtn;
	public WebElement getcheckbtn() {
		return checkbtn;
	}
	
	@FindBy(xpath="/html/body/div[2]/section[1]/div[2]/div[2]/p")
	WebElement availabilityStatus;
	public WebElement getavailabilityStatus(){
		return availabilityStatus;
	}
	
	@FindAll(@FindBy(xpath="//*[@id=\"tab-1\"]/div"))
	List<WebElement> productOverview;
	public List<WebElement> getproductOverview(){
		return productOverview;
	}
	
	
	@FindBy(xpath="//header/nav[1]/ul[1]/li[4]/a[1]")
	WebElement sofacategory;
	public WebElement getsofacategory() {
		return sofacategory;
	}
	@FindBy(xpath="/html/body/header/nav/ul/li[4]/div/div/section/article[1]/ul/li[3]/a")
	WebElement woodenSofas;
	public WebElement getwoodenSofas() {
		return woodenSofas;
	}
	@FindBy(xpath="//*[@id=\"pimage_821\"]")
	WebElement selectsofa;
	public WebElement getselectsofa() {
		return selectsofa;
	}
	
	@FindAll(@FindBy(xpath="/html/body/div[2]/section[1]/div[2]/section"))
	List<WebElement> productDetails;
	public List<WebElement> getproductDetails(){
		return productDetails;
	}
	
	

	
	//Filters Functionality
	@FindBy(linkText="CLEAR ALL")
	WebElement clearall;
	public WebElement getclearall() {
		return clearall;
	}
	@FindBy(xpath="/html/body/div[2]/div/section/div[1]/ul[1]/li[1]/label/span")
	WebElement pricefilter;
	public WebElement getpricefilter() {
		return pricefilter;
	}
	@FindBy(xpath="/html/body/div[2]/div/section/div[1]/ul[2]/li[1]/label/span")
	WebElement finishtypefilter;
	public WebElement getfinishtypefilter() {
		return finishtypefilter;
	}
	
	
	
	
	// Social media icons functionality
	
	
			
	@FindBy(xpath="/html/body/footer/section/div/a[1]")
	WebElement twiter;
	public WebElement gettwiter() {
		return twiter;
	}
	
	@FindBy(xpath="/html/body/footer/section/div/a[2]")
	WebElement facebook;
	public WebElement getfacebook() {
		return facebook;
	}
	
	@FindBy(xpath="/html/body/footer/section/div/a[3]")
	WebElement youtube;
	public WebElement getyoutube() {
		return youtube;
	}
	
	@FindBy(xpath="/html/body/footer/section/div/a[4]")
	WebElement instagram;
	public WebElement getinstagram() {
		return instagram;
	}
	
	@FindBy(xpath="/html/body/footer/section/div/a[5]")
	WebElement pinterest;
	public WebElement getpinterest() {
		return pinterest;
	}
	
	@FindBy(xpath="/html/body/footer/section/div/a[6]")
	WebElement linkedin;
	public WebElement getlinkedin() {
		return linkedin;
	}

	

	

}
