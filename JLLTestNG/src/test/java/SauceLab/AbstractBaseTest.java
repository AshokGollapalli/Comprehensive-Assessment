package SauceLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.lib.AppLib;

public class AbstractBaseTest {
	
	WebDriver driver;	
	private AppLib AppLibrary;
	@Parameters({"Browser","driverEXE"})
	@BeforeMethod(alwaysRun=true)
	  public void beforeMethod(@Optional("Edge")String Browser,@Optional("C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\JLLTestNG\\msedgedriver.exe")String exe) throws InterruptedException {
		
		if(Browser.equals("Edge")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\JLLTestNG\\msedgedriver.exe");
		  driver = new EdgeDriver();
		}else if(Browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\JLLTestNG\\msedgedriver.exe");
			driver = new ChromeDriver();
		}else if(Browser=="IE"){
			System.setProperty("webdriver.ie.driver","C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\JLLTestNG\\msedgedriver.exe");
			driver = new InternetExplorerDriver();
		}
		  driver.manage().window().maximize();		   
		  
		  AppLibrary = new AppLib(driver);
	  }

	  @AfterMethod(alwaysRun = true)
	  public void afterMethod() throws InterruptedException {
		  
		  Thread.sleep(2000);
		  driver.close();
	  }
	  
	  public AppLib App() {
		  return AppLibrary;
	  }
}
