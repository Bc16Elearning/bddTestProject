package stepDefination;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	public static WebDriver driver;
	public String phoneselection = "4";
	public String laptopselection = "4";
	public String monitorselection = "2";

	@Given("I am on google browser")
	public void I_am_on_google_browser() {
		// initialization of ChromeBrowser
		driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Proving some implicit wait to load all elements on Website
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("I am using Demoblaze URL")
	public void I_am_using_Demoblaze_url() {
		// Open DemoBlaze Website
		driver.get("https://www.demoblaze.com/");
	}

	@Then("Check correct website is opened")
	public void Check_correct_website_is_opened() {
		String expectedUrl = "https://www.demoblaze.com/";
		String actualUrl = driver.getCurrentUrl();
		// Validating the URL
		if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Verification Successful: You are on demoblaze Website");
		} else {
			System.out.println("Verification Failed:you are on wrong website");

		}

	}

	@Given("I am on Demoblaze website")
	public void I_am_on_Demoblaze_website() {
		// Click on login button
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	}

	@When("I am using credential for login")
	public void I_am_using_credential_for_login() {
		// enter user name
		driver.findElement(By.id("loginusername")).sendKeys("Noa Later8");
		// enter password
		driver.findElement(By.id("loginpassword")).sendKeys("123456");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}

	@Then("Check greeting message is visible")
	public void check_greeting_message_is_visible() {
		try {
			String expectedGreeting = "Welcome Noa Later8";
			Thread.sleep(5000);
			String actualGreeting = driver.findElement(By.id("nameofuser")).getText();
			// Verifying Greeting message
			if (actualGreeting.equals(expectedGreeting)) {
				System.out.println("Welcome Greeting is displayed");
			} else {
				System.out.println("Welcome Greeting is not displayed");
			}
			Thread.sleep(5000);
			// logout
			driver.findElement(By.id("logout2")).click();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Given("I am on Demoblaze")
	public void I_am_on_Demoblaze() {
		// refreshing URL demoblaze
		driver.navigate().refresh();
	}

	@When("if I am using correct credential for login")
	public void if_i_am_using_correct_credential_for_login() {
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
			driver.findElement(By.id("loginusername")).sendKeys("Noa Later8");
			driver.findElement(By.id("loginpassword")).sendKeys("123456");
			driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("I should be able to login")
	public void I_should_be_able_to_login() {
		try {
			String expectedGreeting = "Welcome Noa Later8";
			Thread.sleep(5000);
			String actualGreeting = driver.findElement(By.id("nameofuser")).getText();
			// Verifying user Name
			if (actualGreeting.equals(expectedGreeting)) {
				System.out.println("User Name is Matching");
			} else {
				System.out.println("User Name not Matching");
			}
			// closing the browser window
			//	driver.quit();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	// Step 5
	@Given("I am logged in Demoblaze Homepage")

	public void I_am_logged_in_Demoblaze_Homepage() {

		driver.findElement(By.id("cat")).click();
		try {

			Thread.sleep(6000);
			//driver.findElement(By.id("cat")).click();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@When("if I select a Phone to add it to the Cart")
	public void if_I_select_a_Phone_to_add_it_to_the_Cart() {

		//	String phoneselection = "4";

		try {
			Thread.sleep(3000);
			driver.findElement (By.id("cat")).click();
			driver.findElement(By.xpath("//*[@id='itemc'][1]")).click();

			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0, 500)"," ");

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		//driver.findElement(By.xpath("//*[@id='tbodyid']/div["+phoneselection+"]/div/div/h4/a")).click();

		//		driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();



	}
	@Then("I should be able to add the Phone to the Cart")

	public void I_should_be_able_to_add_the_Phone_to_the_Cart() {
		// refreshing URL demoblaze
		//driver.navigate().refresh();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id='tbodyid']/div["+phoneselection+"]/div/div/h4/a")).click();
		driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();

		Alert myalert=driver.switchTo().alert();
		myalert.accept(); //Click on OK button


		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	//Step 6
	@Given("I am in Demoblaze Categories page")

	public void I_am_in_Demoblaze_Categories_page() {

		driver.findElement(By.xpath ("//*[@id='navbarExample']/ul/li[1]/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.id("cat")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}


	}

	@When("if I select a Laptop to add it to the Cart")
	public void if_I_select_a_Laptop_to_add_it_to_the_Cart() {

		//		String laptopselection = "4";

		try {
			Thread.sleep(4000);
			//	driver.findElement (By.id("cat")).click();
			driver.findElement(By.xpath("//*[@id='itemc'][2]")).click();

			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0, 500)"," ");
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			//driver.findElement(By.xpath("//*[@id='tbodyid']/div["+laptopselection+"]/div/div/h4/a")).click();

			//		driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();


		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Then("I should be able to add the Laptop to the Cart")

	public void I_should_be_able_to_add_the_Laptop_to_the_Cart() {
		// refreshing URL demoblaze
		//driver.navigate().refresh();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id='tbodyid']/div["+laptopselection+"]/div/div/h4/a")).click();
		driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();

		Alert myalert=driver.switchTo().alert();
		myalert.accept(); //Click on OK button

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	//tag7

	@When("if I select a Monitor to add it to the Cart")
	public void if_I_select_a_Monitor_to_add_it_to_the_Cart() {

		//	String monitorselection = "2";

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		//driver.findElement (By.id("cat")).click();

		driver.findElement(By.xpath("//*[@id='itemc'][3]")).click();


		//	driver.findElement(By.xpath("//*[@id='tbodyid']/div["+monitorselection+"]/div/div/h4/a")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		//	driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();


	}

	@Then("I should be able to add the Monitor to the Cart")

	public void I_should_be_able_to_add_the_Monitor_to_the_Cart() {
		// refreshing URL demoblaze
		//driver.navigate().refresh();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id='tbodyid']/div["+monitorselection+"]/div/div/h4/a")).click(); 
		driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}


		Alert myalert=driver.switchTo().alert();
		myalert.accept(); //Click on OK button

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		//	driver.findElement(By.xpath("//*[@id='navbarExample']/ul/li[1]/a")).click();

	}

	//@tag8
	//Scenario: Place an Order

	@Given("I am in Demoblaze Cart page")

	public void I_am_in_Demoblaze_Cart_page() {

		driver.findElement(By.xpath("//*[@id='navbarExample']/ul/li[1]/a")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.id ("cartur")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@When("if I click on the Place Order button")

	public void if_I_click_on_the_Place_Order_button() {

		driver.findElement(By.xpath("//*[@id='page-wrapper']/div/div[2]/button")).click();


		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}	

	@Then("I should be able to complete the Purchase the Order")

	public void I_should_be_able_to_complete_the_Purchase_the_order() {

		driver.findElement(By.id("name")).sendKeys("Noa Later8");
		driver.findElement(By.id("country")).sendKeys("Portugal");
		driver.findElement(By.id("city")).sendKeys("Lisboa");
		driver.findElement(By.id("card")).sendKeys("1234567890123456");
		driver.findElement(By.id("month")).sendKeys("JAN");
		driver.findElement(By.id("year")).sendKeys("2026");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]")).click();

		//driver.findElement(By.xpath ("//*[contains(text(), 'Thank you for your purchase!')]").

		// Locate the "Thank you for your purchase!" message
		By thankYouMessageLocator = By.xpath("//*[contains(text(), 'Thank you for your purchase!')]");
		WebElement thankYouMessageElement = driver.findElement(thankYouMessageLocator);

		// Assert that the message "Thank you for your purchase!" is displayed
		boolean isThankYouMessageDisplayed = thankYouMessageElement.isDisplayed();
		Assert.assertTrue(isThankYouMessageDisplayed, "Expected message 'Thank you for your purchase!' not found.");

		//just to check if the assertion really worked
		if (isThankYouMessageDisplayed) {
			System.out.println("Assertion passed: 'Thank you for your purchase!' is displayed.");
		} else {
			System.out.println("Assertion failed: 'Thank you for your purchase!' is not displayed.");
		}

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// 
			e.printStackTrace();
		}

		// Close the Thank you for your purchase modal

		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		// Close the Place Order modal.
		driver.findElement(By.xpath("//*[@id='navbarExample']/ul/li[1]/a")).click();

	}

	/*
	@Given("I am on demoblaze")
	public void I_am_on_demoblaze() {
		// refreshing URL demoblaze
		driver.navigate().refresh();
	}
	 */
	@When ("if I click on the Contact link")
	public void if_I_click_on_the_Contact_link() {

		driver.findElement(By.xpath("//*[@id='navbarExample']/ul/li[2]/a")).click();


		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}	

	@Then("I should be able to send a New Message")

	public void I_should_be_able_to_send_a_New_Message() {

		driver.findElement(By.id("recipient-email")).sendKeys("Simple.Joe@demoblaze.com");
		driver.findElement(By.id("recipient-name")).sendKeys("Joe Controler");
		driver.findElement(By.id("message-text")).sendKeys("Need help with my laptop set up");

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id='exampleModal']/div/div/div[3]/button[2]")).click();

		Alert myalert=driver.switchTo().alert();

		myalert.accept();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}	


	@When ("if I click on the About Us link")
	public void if_I_click_on_the_About_Us_link() {

		driver.findElement(By.cssSelector("a[data-target='#videoModal']")).click();


		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
	@Then ("I should be able to see the About Us modal")	
	public void if_I_should_be_able_to_see_the_About_Us_modal() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id='videoModal']/div/div/div[3]/button")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.id("logout2")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
	@Given("I am on Demoblaze web")
	public void I_am_on_demoblaze_web() {
		// Navigation to Signup URL

		driver.findElement(By.id("signin2")).click();
	}

	@When("click on signup option")
	public void click_on_signup_option() {
		// enter user name
		driver.findElement(By.id("sign-username")).sendKeys("Noa Later94");
		// enter password
		driver.findElement(By.id("sign-password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	}

	@Then("Check signup window should show")
	public void check_signup_window_should_show() {
		try {
			Thread.sleep(4000);
			Alert alt = driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();

	}

}