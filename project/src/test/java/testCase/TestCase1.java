package testCase;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepository.DemoBlazeCategories;
import objectRepository.DemoBlazeLogin;
//import objectRepository.DemoBlazeSignUp;

public class TestCase1{
	

	public static WebDriver driver;
	
	public static String phoneselection = "4";
	public static String laptopselection = "2";
	public static String monitorselection = "2";

	public static void main(String[] args) {
		// launch Chrome browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Open demoblaze website
		driver.get("https://www.demoblaze.com/");
		
		//creating object of DemoBlazeLogin Class
		DemoBlazeLogin dbl=new DemoBlazeLogin(driver);
		dbl.signin();
		dbl.enterName("Noa Later8");
		dbl.enterPass("123456");
		dbl.clickBtn();
		
		// Reseting the Categories
		DemoBlazeCategories dbc = new DemoBlazeCategories(driver);
		dbc.itemCategories();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 400)"," ");
		
		dbc.selectedPhone(phoneselection);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
			
		dbc.addToCart();
		
		
		
		
	
}
	
}	

			

