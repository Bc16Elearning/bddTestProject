package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\test\\java\\features\\demoblaze.feature",
		glue = "stepDefinition",
		plugin = {"html:htmlreport/cucumber-test-report.html","json:target/cucumber-report.json","pretty"}
		)
		
public class Runner {
	
}
