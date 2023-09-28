package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Project;
import support.BaseSteps;
public class ProjectSteps extends BaseSteps {
    private static final Project project = new Project(driver);
    @Dado("que acesso a web com sucesso")
    public void queAcessoAWebComSucesso() {
        project.queacessoawebcomsucesso();
    }
    @E("visualizo e clico na lupa de busca")
    public void visualizoEClicoNaLupaDeBusca() {
        project.visualizoEClicoNaLupaDeBusca();
    }
    @E("insiro no campo de busca o valor {string}")
    public void insiroNoCampoDeBuscaOValor(String arg0) {
        project.insiroNoCampoDeBuscaOValor(arg0);
    }
    @Quando("clico em Pesquisar")
    public void clicoEmPesquisar() {
        project.clicoEmPesquisar();
    }
    @Então("valido meu resultado de busca")
    public void validoMeuResultadoDeBusca() {
        project.validoMeuResultadoDeBusca();
    }
}

