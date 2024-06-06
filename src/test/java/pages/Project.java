package pages;

import support.Setup;
public class Project {
    private final Setup driver;
    public Project(Setup stepDriver) {
        driver = stepDriver;
    }

    public void queacessoawebcomsucesso()  {
        driver.openURL("https://blogdoagi.com.br/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void visualizoEClicoNaLupaDeBusca() {
        driver.click("//*[@class='ast-search-menu-icon slide-search']","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void insiroNoCampoDeBuscaOValor(String arg0){
        driver.findElem("//*[@class='ast-search-menu-icon slide-search ast-dropdown-active']//input[@type='search']","xpath").sendKeys(arg0);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clicoEmPesquisar() {
        driver.click("//*[@class='slide-search astra-search-icon']","xpath");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void validoMeuResultadoDeBusca()  {
        driver.findElem("//*[@id='primary']/header/h1/span","xpath");
        driver.assertStrings("Investidores","Investidores");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}