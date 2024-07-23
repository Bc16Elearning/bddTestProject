package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazeCategories {
	WebDriver driver;

	public static String phoneselection = "4";
	public static String laptopselection = "2";
	public static String monitorselection = "2";

	public DemoBlazeCategories(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "cat")
	WebElement itemCategories;
	
	public void itemCategories() {
		itemCategories.click();
	}
	
	//Categories - List Group [1 - 3]

	@FindBy(xpath = "//*[@id='itemc'][1]")
	WebElement phonesLink;

	public void phonesLink() {
		phonesLink.click();
	}

	@FindBy(xpath = "//*[@id='itemc'][2]")
	WebElement laptopsLink;

	public void laptopsLink() {
		laptopsLink.click();
	}

	@FindBy(xpath = "//*[@id='itemc'][3]")
	WebElement monitorsLink;

	public void monitorsLink() {
		monitorsLink.click();
	}

	//Categories - List Group - Phones - Items [1 - 9]

	@FindBy(xpath = "*[@id='tbodyid']/div[1]/div/a/img")

	WebElement phonerow1col1;

	//Categories - List Group - Laptops - Items [1 - 6]

	@FindBy(xpath = "*[@id='tbodyid']/div[1]/div/a/img")

	WebElement laptoprow1col1;

	//Categories - List Group - Monitors - Items [1 - 2]

	@FindBy(xpath = "*[@id='tbodyid']/div[1]/div/a/img")

	WebElement monitorrow1col1;

	// Add To Cart button.

	@FindBy(xpath = "//*[@id='tbodyid']/div[2]/div/a")
	WebElement addToCartbntn;
	
	public void addToCart() {
		addToCartbntn.click();
	}
	

	public void selectedPhone(String phoneSelection) {

		WebElement phoneSelected =driver.findElement(By.xpath("//*[@id='tbodyid']/div["+phoneSelection+"]/div/div/h4/a"));
		phoneSelected.click(); 
	}
	
	@FindBy(id="cartur")
	WebElement linkCart;
	
	public void linkCart() {
		linkCart.click();
	}
		
	@FindBy(xpath = "//*[@id='page-wrapper']/div/div[2]/button")
	WebElement placeOrderbntn;
	
	public void placeOrderbntn() {
		placeOrderbntn.click();
	}
	
	@FindBy(xpath = "//*[@id='orderModal']/div/div/div[3]/button[2]")
	WebElement purchasebntn;
	
	public void purchasebntn() {
		purchasebntn.click();
	}
	
	
	//By closePurchaseModal =  By.xpath("/html/body/div[10]/div[7]/div/button");
	//By closebntn = By.xpath("//*[@id='orderModal']/div/div/div[3]/button[1]");
	
	@FindBy(xpath = "/html/body/div[10]/div[7]/div/button")
	WebElement clPurchaseModal;
	
	public void clPurchaseModal() {
		clPurchaseModal.click();
	}
	
		
	@FindBy(xpath = "//*[@id='orderModal']/div/div/div[3]/button[1]")
	WebElement closebntn;
	
	// Place Order elements
	
	@FindBy(id ="name")
	WebElement Name;
	
	@FindBy(id ="country")
	WebElement Country;
	
	@FindBy(id ="city")
	WebElement City;
	
	@FindBy(id ="card")
	WebElement Card;
	
	@FindBy(id ="month")
	WebElement Month;
	
	@FindBy(id ="year")
	WebElement Year;
	
	// Thank you for your purchase!" message
	
    @FindBy(xpath = "//*[contains(text(), 'Thank you for your purchase!')]")
    WebElement thanksMessageLocator; 
    
	public void thanksMessageLocator() {
		thanksMessageLocator.click();
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

/*
	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	WebElement loginBtn;

	public void signin() {
		loginBtn.click();
	}
 */




