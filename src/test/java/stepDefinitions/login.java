package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	@Given("user opens the browser")
	public void user_opens_the_browser() {
	   System.out.println("user opens up the browser");
	}
	@When("user hit the url of application")
	public void user_hit_the_url_of_application() {
	    System.out.println("entering URL of the application");
	}
	@Then("login page appears")
	public void login_page_appears() {
	   System.out.println("Login page is appeared");
	}
	
	@Given("user in login page")
	public void user_in_login_page() {
	    System.out.println("in login page");
	}
	@When("^user login into application with  (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String un, String pwd) {
	    System.out.println("username is :"+un);
	    System.out.println("password is :"+pwd);
	}
	
	@Given("user is in practice landing page")
	public void user_is_in_practice_landing_page() {
	    System.out.println("user is in practice landing page");
	}

	@When("user signup into application")
	public void user_signup_into_application(List<String> data) {
	   System.out.println("entering first name : " +data.get(0));
	   System.out.println("entering last name : " +data.get(1));
	   System.out.println("entering email : " +data.get(2));
	   System.out.println("entering phone number : " + data.get(3));
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
	   System.out.println("home page is displayed");
	}

	@Then("user should be able to access the application")
	public void user_should_be_able_to_access_the_application() {
	    System.out.println("user should be access the application");
	    System.out.println();
	}
	
}
