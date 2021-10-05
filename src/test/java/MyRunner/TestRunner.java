package MyRunner;

import io.cucumber.java.it.Data;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
		//stepNotifications = true,
		monochrome = true,
		dryRun = false,
		features = "./src/test/java/Features", 
		glue = "StepDefinition",
		plugin = {"pretty", "html:Reports/HTMLReport.html", "json:target/cucumber.json", "junit: Report/Junit Report.xml"}

)

public class TestRunner  extends AbstractTestNGCucumberTests  {

//	@DataProvider
//	public Object[][] getScenarios() {
//		return super.scenarios();
//	}
}
