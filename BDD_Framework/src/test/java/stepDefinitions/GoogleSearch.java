package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
	    System.out.println("Lanuch google website");
	}

	@When("using is typing the search term {string}")
	public void using_is_typing_the_search_term(String string) {
		 System.out.println("Search linked in site");
	}

	@When("enters the return key")
	public void enters_the_return_key() {
		System.out.println("Search result should be relavent linked in site");
	}

	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
		System.out.println("Click on link and navigate into linked in site");
	}
}
