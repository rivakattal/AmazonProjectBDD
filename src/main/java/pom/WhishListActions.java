package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverManagaer.DriverManager;
import utils.CommonMethods;

public class WhishListActions {

private WebDriver driver;
	
	CommonMethods common = new CommonMethods(DriverManager.getdriver());
	
	public WhishListActions(WebDriver driver) {
		this.driver=driver;
		
		
		PageFactory.initElements(driver, this);
		
	}
	

@CacheLookup
@FindBy(xpath="(//div[@id='nav-tools']//a[2])")
public WebElement Accounts;

@CacheLookup
@FindBy(xpath="//div[@id='nav-flyout-ya-signin']")
public WebElement SigninButton;

@CacheLookup
@FindBy(xpath="//input[@type='email' and @name='email']")
public WebElement Email;

@CacheLookup
@FindBy(className ="a-button-input")
public WebElement ContinueButton;

@CacheLookup
@FindBy(xpath= "//input[@type='password' and @name='password']")
public WebElement Password;

@CacheLookup
@FindBy(id = "signInSubmit")
public WebElement SignIn;

@CacheLookup
@FindBy(xpath = "(//div[@id='nav-xshop-container']//a[1])")
public WebElement Grocery;

@CacheLookup
@FindBy(xpath = "(//div[@id='nav-progressive-subnav']//a[3])")
public WebElement BestSeller;

@CacheLookup
@FindBy(xpath = "(//div[@id='p13n-asin-index-0']//a[1])")
public WebElement Firstimg;

@CacheLookup
@FindBy(xpath = "//input[@id='add-to-wishlist-button-submit']")
public WebElement AddToWishList;

@CacheLookup
@FindBy(xpath = "(//span[@id='huc-view-your-list-button']//a)")
public WebElement ViewWishList;

/////Pay Module locators >>>>>>>>>>>>>>>>>>>>>>>>

@CacheLookup
@FindBy(xpath = "(//div[@id='nav-tools']//a[5])")
public WebElement CartButton;

@CacheLookup
@FindBy(xpath = "//*[@type='submit' and @class='a-button-input']")
public WebElement ProceedToCheckout;

@CacheLookup
@FindBy(xpath="//div[@id='address-book-entry-0']//*[contains(text(),'Edit')]")
public WebElement EditAddress;


@CacheLookup
@FindBy(xpath="(//*[@id='address-ui-widgets-enterAddressPostalCode' and @type='text'])")
public WebElement Pcode;

//////////New Release Locators>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

@CacheLookup
@FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]/i")
public WebElement AllButton;

@CacheLookup
@FindBy(xpath = "(//*[@id='hmenu-content']/ul[1]/li[3]/a)")
public WebElement NewRelease;


///////////////////  Mobile Search Locators>>>>>>>>>>>>>>>>>>>>>>>>>>>

@CacheLookup
@FindBy(id="twotabsearchtextbox")
public WebElement Searchbox;

@CacheLookup
@FindBy(id="nav-search-submit-button")
public WebElement FindButton;

@CacheLookup
@FindBy(xpath="//*[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']//*[contains(text(),'Samsung Galaxy S10 128GB Prism Black 8GB RAM Canadian Model G973W Unlocked ')]")
public WebElement Mobile;

@CacheLookup
@FindBy(xpath="//*[@id='add-to-cart-button' and@type='submit']")
public WebElement ADDToCart;


///////////////////////log out locators>>>>>>>>>>>
@CacheLookup
@FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[34]/a")
public WebElement signout;

public void mousehover() {
common.Actions(Accounts);
common.waitforElement(Accounts);
}

public void clickSignin() {
	clickelement(SigninButton);
}

public void sendkeysEmailid(String emaildata ) {
	sendkeys(Email, emaildata);
}


public void clickContinue() {
	clickelement(ContinueButton);
}
public void sendkeyspasswd(String passwordddata ) {
	sendkeys(Password, passwordddata);
}


public void clickButton() {
	clickelement(SignIn);
}

public void clickGroceryButton() {
	clickelement(Grocery);
}


public void clickBestSell() {
	clickelement(BestSeller);
}

public void clickImg() {
	clickelement(Firstimg);
}

public void clickAddToWList() {
	clickelement(AddToWishList);
}


public void clickViewWList() {
	clickelement(ViewWishList);
}
///////Pay Module  Actions>>>>>>>>>>>>>>>>>>>>>>>
public void clickCart() {
	clickelement(CartButton);
}

public void clickCheckout() {
	clickelement(ProceedToCheckout);
}

public void clickEditButton() {
	clickelement(EditAddress);
}

public void sendkeyspostalCD(String posteldata ) {
	
     Pcode.sendKeys(Keys.DELETE);
	sendkeys(Pcode, posteldata);
}
public void clickaddButton() {
	clickelement(ADDToCart);
}

////////////New Release Actions >>>>>>>>>>>>>>>>>



public void clickAll() {
	clickelement(AllButton);
    common.Scrollele(AllButton);
}

public void clickNewRelease() {
	clickelement(NewRelease);
	
}


//////////////////////////////Mobile Search Actions>>>>>>>>>>>>>>>>>>>>>>>>>

public void clickTextbox() {
	clickelement(Searchbox);
}


public void sendkeysTextbox(String searchdata) {
	
          sendkeys(Searchbox, searchdata);
}

public void clickFind() {
	clickelement(FindButton);
}

public void clickMobilePhone() {
	clickelement(Mobile);
}
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Reusiable methods for click and send keys <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>
public void clickelement(WebElement ele) {
	common.waitforElement(ele);
	common.higlightement(ele);
	ele.click();

	}
public void sendkeys(WebElement ele, String Keys) {
	common.waitforElement(ele);
	common.higlightement(ele);
	
		ele.sendKeys(Keys);

}

//////////////////logout actions>>>>>>>>>>>>>>>>>>>>>>

public void clikSout() {
	clickelement(signout);
 
}
	
}
