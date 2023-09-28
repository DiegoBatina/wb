package steps;

import support.BaseSteps;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;

public class Hooks extends BaseSteps {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("--- Cenário Iniciado >>> " + scenario.getName() + " <<< ---");
    }

    @After
    public void afterScenario(Scenario scenario) throws InterruptedException {
        System.out.println("--- Cenário finalizado >>> " + scenario.getName() + " <<< ---");
        scenario.wait(Long.parseLong("URL: " + driver.getCurrentUrl()));

        driver.quit();

    }
}
