package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DupMakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ashok gollapalli\\eclipse-workspace\\cucumberBDD\\JLLTestNG\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement iframe = driver.findElement(By.xpath("//*[@title='notification-frame-173061b02']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//*[@class='close']")).click();
		//Thread.sleep(5000);
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//*[@class='lbl_input appendBottom10']")).click();

		List<WebElement> List = driver.findElements(By.xpath("//*[@class='font14 appendBottom5 blackText']"));

		for (int i = 0; i < List.size(); i++) {
			if (List.get(i).getText().equalsIgnoreCase("Hyderabad, India")) {
				driver.findElement(By.xpath("(//*[@class='font14 appendBottom5 blackText'])[" + (i + 1) + "]")).click();
			}			
		}
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@class='fsw_inputField lineHeight36 latoBlack font30'])[2]")).click();
		
		List<WebElement> List1 = driver.findElements(By.xpath("//*[@class='font14 appendBottom5 blackText']"));
		for (int i = 0; i < List1.size(); i++) {
			if (List.get(i).getText().equalsIgnoreCase("Mumbai, India")) {
				driver.findElement(By.xpath("(//*[@class='font14 appendBottom5 blackText'])[" +(i+1)+ "]")).click();
				driver.findElement(By.linkText("Search")).click();
			}
			System.out.println(List1.get(i).getText());
		}
	}

}
