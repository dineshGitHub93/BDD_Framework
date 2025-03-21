package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLoginStep {
	
	WebDriver driver = null;
	
	@Given("i am on facebook login page")
	public void i_am_on_facebook_login_page() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
	   driver.findElement(By.id("user-name")).sendKeys(string);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys(string);
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
	}

	@Then("login should show an error message")
	public void login_should_show_an_error_message() {
	    
		String errorMsg = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		if(errorMsg.contains("isn't connected to an account"))
			System.out.println("Unable to login the site with invalid crendentials");
		else
			System.out.println("User is able to login website with invalid crendentials");
		
	}

	@Then("Re-login option should be available")
	public void re_login_option_should_be_available() {
	   
		String currentURL = driver.getCurrentUrl();
		if(currentURL.contains("https://www.facebook.com/login"))
			System.out.println("User can view re-login page");
		else
			System.out.println("unable to view re-login page");
	}
	

}
