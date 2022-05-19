package pom;

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
public WebElement Sbox;




@CacheLookup
@FindBy(id="twotabsearchtextbox")
public WebElement TextBox;

///////////////////////log out locators>>>>>>>>>>>
@CacheLookup
@FindBy(xpath ="//*[@id=\"hmenu-content\"]/ul[1]/li[34]/a")
public WebElement signout;

public void mousehover() {
common.Actions(Accounts);
common.waitforElement(Accounts);
}

public void clickSigninButton() {
	clickelement(SigninButton);
}

public void sendkeysEmail(String emaildata ) {
	sendkeys(Email, emaildata);
}


public void clickContinueButton() {
	clickelement(ContinueButton);
}
public void sendkeyspassword(String passworddata ) {
	sendkeys(Password, passworddata);
}


public void clickSignIn() {
	clickelement(SignIn);
}

public void clickGrocery() {
	clickelement(Grocery);
}


public void clickBestSeller() {
	clickelement(BestSeller);
}

public void clickFirstimg() {
	clickelement(Firstimg);
}

public void clickAddToWishList() {
	clickelement(AddToWishList);
}


public void clickViewWishList() {
	clickelement(ViewWishList);
}
///////Pay Module  Actions>>>>>>>>>>>>>>>>>>>>>>>
public void clickCart() {
	clickelement(CartButton);
}

public void clickCheckout() {
	clickelement(ProceedToCheckout);
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


public void clicktext1() {
	clickelement(Sbox);
}

//reusable function of click and sendkeys

//public void sendkeystext(String textdata) {
//	sendkeys(TextBox, textdata);
//}


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
