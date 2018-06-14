package backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		dryRun = false,
		
		features = {"src/test/resources/backgroundFF/"},
		glue = {"backgroundSD/"},
		
	   plugin = {"pretty",
			 "html:target/cucumber-htmlreport",
               "json:target/cucumber-report.json",
		}
		)

public class RunBackgroundTest {	

}
