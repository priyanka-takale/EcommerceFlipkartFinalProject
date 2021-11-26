package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
                    (
		               features="src/test/resources/BuzinessLogic",
		               glue="cucumbermap",
                       tags="@SmokeTest",
	                   plugin="pretty",
		               dryRun=false,
		               monochrome=true
		
		
		
		)
public class TestRunner {

}
