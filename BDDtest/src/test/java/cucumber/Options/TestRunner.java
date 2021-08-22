package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)



@CucumberOptions(features="D:\\PracticeWorkspace\\BDDtest\\src\\test\\java\\features",
glue={"stepDefinations"},
monochrome=true,
tags= "@Homepage",     //"@AddPlace or @DeletePlace",
//dryRun= true,
publish = true,
plugin="json:target/jsonReports/cucumber-report.json"
)
public class TestRunner {

}
