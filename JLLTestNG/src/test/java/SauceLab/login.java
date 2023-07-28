package SauceLab;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import webPageActions.loginPage;
import webPage_Elements.loginPage_Elements;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class login extends AbstractBaseTest {

	@Test(priority = 2,groups ={"p0","p1"}) 
	public void logIn() throws InterruptedException {
		App().flowLib1().navigateToURL("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		App().Page().loginPagesPL().userName();
		App().Page().loginPagesPL().passWord();
		App().Page().loginPagesPL().clickLoginBtn();
		String TitleAuto = App().flowLib1().getTitle();
		String TitleManual = "Swag Labs";
		Assert.assertEquals(TitleAuto, TitleManual);
	}

	@Test(priority = 3,groups ={"p1","p3"})
	public void logoText() throws InterruptedException {
		App().flowLib1().navigateToURL("https://www.saucedemo.com/");
		Thread.sleep(2000);
		String logo = App().Page().loginPagesPL().logoText();
		System.out.println("logo of the page : " + logo);
	}

	@Test(priority = 1,groups ={"p2","p1"})
	public void listOfOptions() throws InterruptedException {

		App().flowLib1().navigateToURL("https://www.saucedemo.com/");
		Thread.sleep(2000);

		App().Page().loginPagesPL().userName();
		App().Page().loginPagesPL().passWord();
		App().Page().loginPagesPL().clickLoginBtn();

		List<WebElement> shopItems = App().Page().homePagesPL().homePageList();
		System.out.println(shopItems.size());

		Thread.sleep(1000);

		for (int i = 0; i < shopItems.size(); i++) {

			System.out.println(shopItems.get(i).getText());

		}
		Thread.sleep(10000);
	}

}
