package pages;

import org.openqa.selenium.Keys;
import support.Setup;
public class ProjectMobile {
    private final Setup driver;
    public ProjectMobile(Setup stepDriver) {
        driver = stepDriver;
    }
    public void queAcessoAMobileComSucesso() {
        driver.startmobile("chrome");
        driver.openURL("https://blogdoagi.com.br/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clicoNoMenuHamburguer() {
        driver.click("//*[@id='overlay-open']","xpath");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void insiroNoCampoDeBuscaOValorEmModoMobile(String arg0) {
        driver.findElement("//*[@class='mobile-search']//input[@type='search']","xpath").sendKeys(arg0);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clicoEmPesquisarEmModoMobile() {
        driver.findElement("//*[@class='mobile-search']//input[@type='search']","xpath").sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void validoMeuResultadoDeBuscaMobile() {
        driver.findElement("//*[@id='primary']/header/h1/span","xpath");
        driver.assertStrings("Investidores","Investidores");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
