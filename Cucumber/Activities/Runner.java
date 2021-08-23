package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
				glue = {"StepDefinitions"},
				//tags = "@activity1_1",
				//tags = "@activity1_2")
				//tags = "@activity1_3")
				//tags = "@SimpleAlert")
				//tags = "@ConfirmAlert")
				//tags = "@PromptAlert")
				//tags = "@SmokeTest")
				tags = {"@SimpleAlert", "@ConfirmAlert"},
				plugin = { "pretty", "html:target/cucumber-reports/reports"},
			    monochrome = true) 
public class Runner {

}
