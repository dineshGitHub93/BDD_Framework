package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.Hook;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilis.WebdriverManager;

public class SauceLoginPage{

	WebDriver driver = WebdriverManager.getDriver();
	LoginPage loginpage = new LoginPage(driver);

	@Given("user is on login page of sauce website")
	public void user_is_on_login_page_of_sauce_website() {
		//driver.get("https://www.saucedemo.com/");
	}

	@When("I enters usernams as {string} and password as {string}")
	public void i_enters_usernams_as_and_password_as(String string, String string2) {
		loginpage.enterUsername(string);
		loginpage.enterPassword(string2);
		loginpage.clickOnLogin();
	}

	@Then("user should navigate use to the home page")
	public void user_should_navigate_use_to_the_home_page() {

	}
}
