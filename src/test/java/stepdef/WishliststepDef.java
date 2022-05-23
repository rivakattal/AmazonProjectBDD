package stepdef;

import org.junit.Assert;
import org.testng.Reporter;

import DriverManagaer.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.WhishListActions;


public class WishliststepDef {

	WhishListActions wlAct=new WhishListActions(DriverManager.getdriver());

	
	@Given("I want to validate that i am on Amazon home page")
	public void i_want_to_validate_that_i_am_on_amazon_home_page() {
		String actualurl= DriverManager.getdriver().getCurrentUrl();
		Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/"));
		Reporter.log("This is expected url >> "+ actualurl);
		

	}

	@Given("I mouse hover over Accounts & lists section")
	public void i_mouse_hover_over_accounts_lists_section() {
	   
		wlAct.mousehover();
		
	}
	
	@Then("I make a click on Sign in button")
	public void i_make_a_click_on_sign_in_button() {
	   
		wlAct.clickSignin();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actulTitle= DriverManager.getdriver().getTitle();
		 String expectedTitle= "Amazon Sign In";
		
		 Assert.assertEquals(actulTitle,expectedTitle);
		 
		
	    
	}
	
	
	@Then("I See {string} text box")
	public void i_see_text_box(String string) {
	   
		
		wlAct.sendkeysEmailid("seemajoshi295@yahoo.com");

		
	}
	
	@Then("I Click on continue button")
	public void i_click_on_continue_button() {
	   
		wlAct.clickContinue();
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 String actulText= wlAct.ContinueButton.getText();
		 String expectedtext= "Continue";
	
		 Assert.assertEquals(actulText,expectedtext);
	*/
	}
	
	
	@Then("^I see\"([^\"]*)\" field$")
	public void iSeeField(String arg1)  {

		wlAct.sendkeyspasswd("Rocker22@");
	}
	
	
	
	
	@Then("I see\"<password>\" field button")
	public void i_see_password_field_button() {
	    
		wlAct.sendkeyspasswd("Rocker22@");
	
     }
	
	@Then("I click on Signin button")
	public void i_click_on_signin_button()  {
	
		wlAct.clickButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actulTitle= DriverManager.getdriver().getTitle();
		 String expectedTitle= "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
		
		 Assert.assertEquals(actulTitle,expectedTitle);
		 
	}
	
	@Then("I clicked on Grocery button at top bar")
	public void i_clicked_on_grocery_button_at_top_bar() {
	    wlAct.clickGroceryButton();
	}
	
	@Then("I click on best sellers")
	public void i_click_on_best_sellers() {
	 
		wlAct.clickBestSell();
	}
	
	@Then("I clicked on first Img item")
	public void i_clicked_on_first_img_item() {
	    
		wlAct.clickImg();
	}
	
	@Then("I click on add to wish list item")
	public void i_click_on_add_to_wish_list_item() {
	   
		wlAct.clickAddToWList();
	}
	
	@Then("i ckicked on viwe your list button")
	public void i_ckicked_on_viwe_your_list_button() throws Throwable {
	    
		wlAct.clickViewWList();
		Thread.sleep(3000);
		String actualurl= DriverManager.getdriver().getCurrentUrl();
		Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/hz/wishlist/ls/1HFQKQPGEV7D2?ref_=wl_dp_view_your_list"));
		Reporter.log("This is expected url >> "+ actualurl);
		
	}
//  pay Module steps>>>>>>>>>>>>>>>>>>>
	
	@Then("I click on cart button")
	public void i_click_on_cart_button() {
	
		
		wlAct.clickCart();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		String actualurl= DriverManager.getdriver().getCurrentUrl();
		Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/gp/cart/view.html?ref_=nav_cart"));
		Reporter.log("This is expected url >> "+ actualurl);
	
	
	}

	@Then("I Click on Proceed to checkout button")
	public void i_click_on_proceed_to_checkout_button() {
	   
		wlAct.clickCheckout();
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    String actulTitle= DriverManager.getdriver().getTitle();
		 String expectedTitle= "Select a shipping address";
		
		 Assert.assertEquals(actulTitle,expectedTitle);
		 Reporter.log("This is expected title >> "+ actulTitle );
	}
	
	
	@Then("I Click on Edit address tab")
	public void i_click_on_edit_address_tab()  {
	   
		
		wlAct.clickEditButton();
	
		/*   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		String actulTitle= DriverManager.getdriver().getTitle();
		 String expectedTitle= "Amazon.ca Checkout: Edit Address";
		
		 Assert.assertEquals(actulTitle,expectedTitle);
*/		
		
	}
	
	@Then("I enter new {string} to text box")
	public void i_enter_new_to_text_box(String string) {
	   
	
		wlAct.sendkeyspostalCD("L6R0L6");
		
	}



// New Release Steps >>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	

@Then("I click on ALL dropdown button")
public void i_click_on_all_dropdown_button() {
   
	wlAct.clickAll();
}



@Then("i click on New release")
public void i_click_on_new_release() {
    
	wlAct.clickNewRelease();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String actualurl= DriverManager.getdriver().getCurrentUrl();
	Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/gp/new-releases/?ref_=nav_em_cs_newreleases_0_1_1_3"));
	Reporter.log("This is expected url >> "+ actualurl);
}


//  <<<<<<<<<<<<Search for Mobile Module steps>>>>>>>>>>>>>>>>

@Then("I click on search box")
public void i_click_on_search_box() {
 
wlAct.clickTextbox();		
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
}



@Then("I send {string} of mobile phone")
public void i_send_of_mobile_phone(String string) {
    
	
	wlAct.sendkeysTextbox("samsunggalaxys10");
}



@Then("I click on search tab")
public void i_click_on_search_tab() {
	
	wlAct.clickFind();

	/*
	 * try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
	String actulTitle= DriverManager.getdriver().getTitle();
	 String expectedTitle= "Amazon.ca : samsung galaxy x10";
	
	 Assert.assertEquals(actulTitle,expectedTitle);
	 */
	
}

@Then("I click on Mobile phone link")
public void i_click_on_mobile_phone_link() {
    
	wlAct.clickMobilePhone();
	
}

@Then("i click on AddTO Cart tab")
public void i_click_on_add_to_cart_tab() {
   
	wlAct.clickaddButton();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String actulTitle= DriverManager.getdriver().getTitle();
	 String expectedTitle= "Amazon.ca Shopping Cart";
	
	 Assert.assertEquals(actulTitle,expectedTitle);
	 
}






//////////////logout step def>>>>>>>>>>>>>>>>>>


@Then("I click on signout button")
public void i_click_on_signout_button() {
   
	
	wlAct.clikSout();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String actulTitle= DriverManager.getdriver().getTitle();
	 String expectedTitle= "Amazon Sign In";
	
	 Assert.assertEquals(actulTitle,expectedTitle);
	 Reporter.log("This is expected title >> "+ actulTitle );
	 
}


}
