package pages;

import support.Setup;
public class Project {
    private final Setup driver;
    public Project(Setup stepDriver) {
        driver = stepDriver;
    }
    public void queacessoawebcomsucesso()  {
        driver.startweb("chrome");
        driver.openURL("https://blogdoagi.com.br/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void visualizoEClicoNaLupaDeBusca() {
        driver.click("search-open","id");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void insiroNoCampoDeBuscaOValor(String arg0){
        driver.findElement("//*[@class='desktop-search']//input[@type='search']","xpath").sendKeys(arg0);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clicoEmPesquisar() {
        driver.click("//input[@value='Pesquisar']","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void validoMeuResultadoDeBusca()  {
        driver.findElement("//*[@id='primary']/header/h1/span","xpath");
        driver.assertStrings("Investidores","Investidores");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}