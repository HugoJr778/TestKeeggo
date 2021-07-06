package test.suites.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		dryRun = false,
		features = {"src\\test\\java\\features"},
			glue = {"core.report",
					"test.generic",
					"test.business.login"}, 
					
			tags = {"@AOS002"}
)

public class AOS002 {}