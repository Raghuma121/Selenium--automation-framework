package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features=".//Features/Login.Feature.feature",
	//	features={".//Features/Customers.feature",".//Features/Login.Feature.feature"},
		//features=".//Features/",
		glue = "StepDefination",
		  dryRun = false,
		  monochrome = true,
		//  tags="@regression",//Scenarios under @Sanity will be executed
		  plugin = {"pretty","html:target/cucumber-Reports/reports1.html"}
		  )
		  
		  //plugin = {"pretty","json:target/cucumber-Reports/report_json.json","junit:target/cucumber-Reports/report_xml.xml","html:target/cucumber-Reports/reports1.html"}
		  //plugin = {"pretty","html:target/cucumber-Reports/reports1.html"}

public class Run {

}
//tags="@Sanity"//will run Scenario which is tagged with Sanity.Does not matter if it has other tags as well.
//tags="@Sanity or @regression" //will run scenario tagged with Sanity or regression.
//tags="@Sanity and @regression" // will run Scenario which is tagged with Sanity as well as regression.
//tags="@Sanity and not @Regression"// will run scenario which is tagged with Sanity but not Regression.