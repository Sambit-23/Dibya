package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features="src/test/java/features",
		glue="stepDefinitions",
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true,
		tags="@PC or @SC or @TC_0101 or @TC_0102 or @EmployeeFilter or @TC_0001")

public class TestRunner{
	
}

