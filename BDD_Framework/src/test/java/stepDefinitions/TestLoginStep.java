package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginStep {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enter is username as {string} and password as {string}")
	public void user_enter_is_username_as_and_password_as(String string, String string2) {
		 driver.findElement(By.id("user-name")).sendKeys(string);
		 driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("user should show an error message")
	public void user_should_show_an_error_message() {
		driver.findElement(By.id("login-button")).click();
		String currentURL = driver.getCurrentUrl();
		if(currentURL.contains("https://www.saucedemo.com/inventory.html"))
			System.out.println("User can view re-login page");
		else
			System.out.println("unable to view re-login page");
		
	}

}
