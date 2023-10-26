package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            tags = "@CenarioUm",
            features = "src/test/resources",
            glue = "steps",
            plugin = {"html:target/cucumber-html-report/report.html",
                    "json:target/cucumber-reports/CucumberReport.json"}
    )
    public class RunnerTestJUnit {

}
