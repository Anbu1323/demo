package com.facebook.stepdefines;

import org.openqa.selenium.WebDriver;

import com.facebook.runner.Test_Runner;

import Ecommerce.Facebook.Baseclass;
import Ecommerce.Facebook.FacebookManagerobj;
import Ecommerce.Facebook.Loginpagerepo;
import Ecommerce.Facebook.Readerfbmanager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass{
	
	
	public static WebDriver test = Test_Runner.test;
    public static 	FacebookManagerobj fbobject = new FacebookManagerobj(test);

	
	@Given("User Launch The Application")
	public void user_launch_the_application()  {

	    geturls("https://www.facebook.com/");
	}

	@When("user Enter The Username In Username Field")
	public void user_enter_the_username_in_username_field() {
	   
		SendKeysAction(fbobject.Home_page().getEmailid(), "anbu123@gmail.com");
	}

	@When("user Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {
	  
	}

	@Then("user Click The Login Button For Login To Page")
	public void user_click_the_login_button_for_login_to_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user Entered The Incorrect Data It Will Came To Login Page Again")
	public void user_entered_the_incorrect_data_it_will_came_to_login_page_again() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user Click The Register Button And It Navigates To Signup Page")
	public void user_click_the_register_button_and_it_navigates_to_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("user Is Trying To Creating An Account")
	public void user_is_trying_to_creating_an_account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user Enter The Firstname In Firstname Field")
	public void user_enter_the_firstname_in_firstname_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user Enter The Surname In Surname Field")
	public void user_enter_the_surname_in_surname_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user Enter The Mobil Number Or Email In Respected Field")
	public void user_enter_the_mobil_number_or_email_in_respected_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user Enter The Password In New Password Field")
	public void user_enter_the_password_in_new_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user Select The Date Of Birth in Date Function")
	public void user_select_the_date_of_birth_in_date_function() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user Select The Month Of Birth In Month Function")
	public void user_select_the_month_of_birth_in_month_function() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user Select The Year Of Birth In Year Function")
	public void user_select_the_year_of_birth_in_year_function() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user Click The Gender In Gender Selection Field")
	public void user_click_the_gender_in_gender_selection_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user Click The Signup Button")
	public void user_click_the_signup_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
	
	
	
	
	
	
	
}
