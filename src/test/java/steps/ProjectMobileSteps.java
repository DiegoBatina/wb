package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.ProjectMobile;
import support.BaseSteps;

public class ProjectMobileSteps extends BaseSteps {
 private static final ProjectMobile projectmobile = new ProjectMobile(driver);
    @Dado("que acesso a mobile com sucesso")
    public void queAcessoAMobileComSucesso() {
        projectmobile.queAcessoAMobileComSucesso();
    }
    @E("clico no menu hamburguer")
    public void clicoNoMenuHamburguer() {
        projectmobile.clicoNoMenuHamburguer();
    }
    @E("insiro no campo de busca o valor {string} em modo mobile")
    public void insiroNoCampoDeBuscaOValorEmModoMobile(String arg0) {
        projectmobile.insiroNoCampoDeBuscaOValorEmModoMobile(arg0);
    }
    @Quando("clico em Pesquisar em modo mobile")
    public void clicoEmPesquisarEmModoMobile() {
        projectmobile.clicoEmPesquisarEmModoMobile();
    }
    @Então("valido meu resultado de busca mobile")
    public void validoMeuResultadoDeBuscaMobile() {
        projectmobile.validoMeuResultadoDeBuscaMobile();
    }
}
