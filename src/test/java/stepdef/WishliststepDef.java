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
	   
		wlAct.clickSigninButton();
    /*  String actulTitle= DriverManager.getdriver().getTitle();
      String expectedtitle="Sign in";
      
      Assert.assertTrue("this is not actual title", actulTitle.contains(expectedtitle));
      */
		
	    
	}
	
	
	@Then("I See {string} text box")
	public void i_see_text_box(String string) {
	   
		
		wlAct.sendkeysEmail("seemajoshi295@yahoo.com");
		
		/*  String actulTitle= DriverManager.getdriver().getTitle();
	      String expectedtitle= "E-mail address or mobile phone number";
	      
	      Assert.assertTrue("this is not actual title", actulTitle.contains(expectedtitle));
	      */
		
	}
	
	@Then("I Click on continue button")
	public void i_click_on_continue_button() {
	   // wlAct.ContinueButton.getText();
		wlAct.clickContinueButton();
	/*	 String actulTitle= DriverManager.getdriver().getText();
	      String expectedtitle=  "Continue";
	      		
	      
	      Assert.assertTrue("this is not actual title", actulTitle.contains(expectedtitle));
	      */
	
	}
	
	
	@Then("I see\"Rocker22@\" field")
	public void i_see_rocker22_field() {
	    
		wlAct.sendkeyspassword("Rocker22@");
	}

	
     @Then("I see\"<password>\" field")
     public void i_see_password_field() {
	    
		wlAct.sendkeyspassword("Rocker22@");
	
     }
	
	@Then("I click on Signin button")
	public void i_click_on_signin_button() {
	
		wlAct.clickSignIn();
	}
	
	@Then("I clicked on Grocery button at top bar")
	public void i_clicked_on_grocery_button_at_top_bar() {
	    wlAct.clickGrocery();
	}
	
	@Then("I click on best sellers")
	public void i_click_on_best_sellers() {
	 
		wlAct.clickBestSeller();
	}
	
	@Then("I clicked on first Img item")
	public void i_clicked_on_first_img_item() {
	    
		wlAct.clickFirstimg();
	}
	
	@Then("I click on add to wish list item")
	public void i_click_on_add_to_wish_list_item() {
	   
		wlAct.clickAddToWishList();
	}
	
	@Then("i ckicked on viwe your list button")
	public void i_ckicked_on_viwe_your_list_button() {
	    
		wlAct.clickViewWishList();
	}
//  pay Module steps>>>>>>>>>>>>>>>>>>>
	
	@Then("I click on cart button")
	public void i_click_on_cart_button() {
	wlAct.clickCart();
	}

	@Then("I Click on Proceed to checkout button")
	public void i_click_on_proceed_to_checkout_button() {
	    wlAct.clickCheckout();
	}
// New Release Steps >>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	

@Then("I click on ALL dropdown button")
public void i_click_on_all_dropdown_button() {
   
	wlAct.clickAll();
}



@Then("i click on New release")
public void i_click_on_new_release() {
    
	wlAct.clickNewRelease();
	
}


//  <<<<<<<<<<<<Search for Mobile Module steps>>>>>>>>>>>>>>>>



@Then("I click on search box")
public void i_click_on_search_box() {
    wlAct.clicktext1();
}


@Then("I see search {string} textbox")
public void i_see_search_textbox(String string) {
   // wlAct.sendkeystext("samsung galaxy s10");
}

@Then("I click on search button")
public void i_click_on_search_button() {
    
}

@Then("I see search results")
public void i_see_search_results() {
   
}

@Then("I click on phone")
public void i_click_on_phone() {
    
}

@Then("I highlight the price")
public void i_highlight_the_price() {
}

@Then("I click on delivery location")
public void i_click_on_delivery_location() {
   
}

@Then("I enter {string}")
public void i_enter(String string) {
    
}
//////////////logout step def>>>>>>>>>>>>>>>>>>


@Then("I click on signout button")
public void i_click_on_signout_button() {
    
}
}
