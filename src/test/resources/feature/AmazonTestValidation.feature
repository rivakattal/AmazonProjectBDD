@Amazonhome
Feature: 	Validate Amazon Features
  I want to validate Amazon Features
  
  @AmazonURLvalidation
  Scenario: validation that i am on correct URL 
    Given I want to validate that i am on Amazon home page
    
    
       @WishlistValidation @regression @sanity
   Scenario Outline: validate signin and wish list with dd testing

		Given I mouse hover over Accounts & lists section
    Then 	I make a click on Sign in button 
    Then  I See "<Email>" text box 
    Then 	I Click on continue button
    Then  I see"<password>" field
    Then 	I click on Signin button
    Then 	I clicked on Grocery button at top bar
    Then 	I click on best sellers
    Then 	I clicked on first Img item 
    Then 	I click on add to wish list item
    Then 	i ckicked on viwe your list button
    
    Examples:
    |Email       |password|
    |seemajoshi295@yahoo.com |Rocker22@|
    
    @PayModuleValidation
   Scenario Outline: navigation to navigate to Amazon Pay module and validate the page 

		Given I mouse hover over Accounts & lists section
    Then 	I make a click on Sign in button 
    Then  I See "<Email>" text box 
    Then 	I Click on continue button
    Then  I see"<password>" field
    Then 	I click on Signin button
    Then I click on cart button
    Then I Click on Proceed to checkout button
    
     @NewreleaseModule 
    Scenario: navigate New release Module and validate the page
    
    Given I want to validate that i am on Amazon home page
    Then I click on ALL dropdown button
    Then i click on New release
    
    @SearchForMobileModule
    
    Scenario Outline: Select the product and Get the Mobile price  and validate it 
    
    Given I want to validate that i am on Amazon home page
   Then  I See "<enterSearch>" text box
    Then I click on search button
    Then I see search results 
    Then I click on phone
    Then I highlight the price
    Then I click on delivery location
    Then I enter "<postalCode>"
    Then   I click on search box
    
    Examples:
    
    |  enterSearch  | postalCode  |
    |  samsung galaxy s10 | N3T0P8 |  
    
    @Login_logoutFeature
    Scenario Outline:  logout feature
    
   Given I mouse hover over Accounts & lists section
    Then 	I make a click on Sign in button 
    Then  I See "<Email>" text box 
    Then 	I Click on continue button
    Then  I see"<password>" field
    Then 	I click on Signin button
    Then I click on ALL dropdown button
    Then I click on signout button 
  
    