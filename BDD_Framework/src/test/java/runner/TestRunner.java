package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="src/test/resources/features",
		glue = {"stepDefinitions","hooks"},
		tags = "@sauce",
		monochrome = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
