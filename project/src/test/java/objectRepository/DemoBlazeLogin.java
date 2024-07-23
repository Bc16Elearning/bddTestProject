package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazeLogin {
	WebDriver driver;

	public DemoBlazeLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// By linkHome=By.xpath("//*[@id='navbarExample']/ul/li[1]/a");
	
	@FindBy(xpath = ("//*[@id='navbarExample']/ul/li[1]/a"))
	WebElement linkHome;
	
	public void home() {
		linkHome.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	
	//@FindBy(id = "login2")
	
	WebElement loginBtn;

	@FindBy(id = "loginusername")
	WebElement userName1;

	@FindBy(id = "loginpassword")
	WebElement userPassword;
	
	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	WebElement login;

	public void signin() {
		loginBtn.click();
	}

	public void enterName(String uName) {
		userName1.sendKeys(uName);
	}

	public void enterPass(String uPass) {
		userPassword.sendKeys(uPass);
	}

	public void clickBtn() {
		login.click();
	}
	
	// Contact Link
	@FindBy(xpath = ("//*[@id='navbarExample']/ul/li[2]/a"))
	WebElement contactLink;
	
	public void contactLink() {
		contactLink.click();
	}
	
	@FindBy(xpath = ("//*[@id='exampleModal']/div/div/div[3]/button[2]"))
	WebElement sendmsgbntn;
	
	public void sendmsgbntn() {
		sendmsgbntn.click();
	}	
	
	@FindBy(xpath = ("//*[@id='exampleModal']/div/div/div[3]/button[1]"))
	WebElement closebntn;
	
	public void closebntn() {
		closebntn.click();
	}	
	
	// About Us
	
	@FindBy(css = ("a[data-target='#videoModal']"))
	WebElement aboutUsLink;
	
	public void aboutUsLink() {
		aboutUsLink.click();
	}
	
	@FindBy(xpath = ("//*[@id='videoModal']/div/div/div[3]/button"))
	WebElement aboutUsCl;
	
	public void aboutUsCl() {
		aboutUsCl.click();
	}
		
	@FindBy(id = "signin2")
	WebElement signUpLink;
	
	public void signUpLink() {
		signUpLink.click();
	}
	
	@FindBy(id = "sign-username")
	WebElement signName;

	@FindBy(id = "sign-password")
	WebElement signPassword;
	
	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement signupbtn;
	
	
	@FindBy(id = "logout2")
	WebElement logoutLink;
	
	public void logoutLink() {
		logoutLink.click();
	}
	
	
	
	
	
	
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