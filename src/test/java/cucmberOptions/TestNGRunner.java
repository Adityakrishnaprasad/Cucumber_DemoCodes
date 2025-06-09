package cucmberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/featureFile", glue="stepDefinitions",monochrome=true,tags="not @RegressionTest")
public class TestNGRunner extends AbstractTestNGCucumberTests { 
	
}
 