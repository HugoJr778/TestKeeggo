package test.suites.cadasto;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		dryRun = false,
		features = {"src\\test\\java\\features"},
			glue = {"core.report",
					"test.generic",
					"test.business.cadastro"}, 
					
			tags = {"@AOS001"}
)

public class AOS001 {}