package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = "steps",
        tags = "@CenarioUm",
        plugin = {"pretty", "html:target/cucumber-html-report/report.html"}
)
public class RunnerTestNG extends AbstractTestNGCucumberTests {

}

