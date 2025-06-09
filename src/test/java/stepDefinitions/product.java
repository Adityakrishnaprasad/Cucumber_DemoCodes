package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class product {
	
	@Given("user logged into applictaion")
	public void user_logged_into_applictaion() {
	    System.out.println("logging in into application");
	}

	@When("user enters {string} in search field")
	public void user_enters_in_search_field(String product) {
		 System.out.println("searching for  a product ");
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		 System.out.println("clicks on search button");
	}

	@Then("user should navigate to that product listing page")
	public void user_should_navigate_to_that_product_listing_page() {
	  System.out.println("navigated to products listing page");
	}

	@Then("user should see a message like no product found")
	public void user_should_see_a_message_like_no_product_found() {
		 System.out.println("no products message is found");
	}


}
