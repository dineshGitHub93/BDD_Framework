package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//Locators
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginButton = By.id("login-button");
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Actions
	public void enterUsername(String userName) {
		driver.findElement(loginButton).sendKeys(userName);;
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLogin() {
		driver.findElement(loginButton).click();
	}
	
}
