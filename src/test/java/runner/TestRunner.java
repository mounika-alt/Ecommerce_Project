package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

		
		features= {"src/test/java/featureFiles"},
		glue= {"StepDefinition"},
		plugin={"pretty:STDOUT","html:target/cucumber-html-report",
			    "json:target/cucumber.json",
			    "junit:target/cucumber.xml",
			   "rerun:target/rerun.txt"},
		tags ={"@TestRun02"}
		
		
		)


public class TestRunner {

}
