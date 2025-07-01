
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue = "StepDefinitions",
		plugin = "pretty",
		monochrome = true // To make the output more readable
)
public class TestRunner extends AbstractTestNGCucumberTests {}
