package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/GoogleSearch.feature" }, // feature file or folder name
		glue = { "stepdefinitions", "hooks" }, tags = "@Smoke", plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true, publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
