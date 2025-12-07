package cucmberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/featureFile/product.feature", glue="stepDefinitions",monochrome=true, tags="not @RegressionTest")
public class TestNGRunner extends AbstractTestNGCucumberTests { 
	//C:\Users\adity\eclipse-workspace\Cucumber_DemoCodes\src\test\java\featurefile\product.feature tags="not @RegressionTest"
}
 