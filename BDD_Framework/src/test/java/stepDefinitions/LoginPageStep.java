package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {
	
	@Given("user is login on page")
	public void user_is_login_on_page() {
	   System.out.println("login page");
	}

	@When("user enters valid username as {string} and password as {string}")
	public void user_enters_valid_username_as_and_password_as(String string, String string2) {
		System.out.println(string+" "+string2);
	}

	@Then("user should be redirected to the homepage")
	public void user_should_be_redirected_to_the_homepage() {
		System.out.println("Navigate to homepage");
	}


}
