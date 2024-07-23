package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazeSignUp {
	WebDriver driver;

	public DemoBlazeSignUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "signin2")
	WebElement SignLink;
	
	public void SignLink() {
		SignLink.click();
	}
	
	
	@FindBy(id = "sign-username")
	WebElement userName;

	@FindBy(id = "sign-password")
	WebElement userPassword;
	
	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement signupbtn;

	public void signupbtn() {
		signupbtn.click();
	}

	public void enterName(String uName) {
		userName.sendKeys(uName);
	}

	public void enterPass(String uPass) {
		userPassword.sendKeys(uPass);
	}
/*
	public void clickBtn() {
		signup.click();
	}
	
	//Log Out Link
	
		
	
	
	public void logoutLink() {
		logoutLink.click();
	}
	
	// Sign Up
*/	
		
	
	
	
	
	
	
	
	public boolean isAlertPresent() {
		boolean flag=false;
		try {
			driver.switchTo().alert().accept();
			flag=true;
			
		}
		catch(Exception e) {
			flag=false;
		}
		return flag;
	}
	
}
