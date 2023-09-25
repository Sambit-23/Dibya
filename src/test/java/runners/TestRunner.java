package runners;

 

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 

@RunWith(Cucumber.class)

@CucumberOptions(

	
        plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/jsonReports/cucumber-report.html"},
        features = {"src/test/java/features"},
        glue = {"steps"},
        tags = "@Customer_05",
        publish=true 
              )
public class TestRunner


{

 

}