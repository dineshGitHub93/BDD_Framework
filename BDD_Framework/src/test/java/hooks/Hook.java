package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilis.WebdriverManager;

public class Hook extends WebdriverManager{
	
	
	@Before
	public void browerSetUp() {
		System.out.println("Browser lanunching");
		getDriver().get("https://www.saucedemo.com/");
	}

	@After
	public void tearDown() {
		System.out.println("closing browser");
		quitDriver();
	}
	
}
