package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDataTableStep {

	WebDriver driver;
	

	@Given("I am on the new registration page")
	public void i_am_on_the_new_registration_page() {
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}

	@When("I enter invalid valid data page")
	public void i_enter_invalid_valid_data_page(DataTable dataTable) {
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement userNumber = driver.findElement(By.id("userNumber"));
		
		//initialize data table
		List<List<String>> data = dataTable.asLists(String.class);
			
			System.out.println(data);
			firstName.sendKeys(data.get(1).get(1));
			lastName.sendKeys(data.get(2).get(1));
			userEmail.sendKeys(data.get(3).get(1));
			userNumber.sendKeys(data.get(4).get(1));
			 /*
			String username = row.get(0);
			String password = row.get(1);
			System.out.println("Logging in with: " + username + " / " + password);
			*/
		
	}

	@Then("the user registration should be successful")
	public void the_user_registration_should_be_successful() {
		System.out.println("Test");
	}
}
