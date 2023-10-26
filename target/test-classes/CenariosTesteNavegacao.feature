#language: pt
@Completo
Funcionalidade: Acessar com sucesso a pagina e executar em duas aborgens de tamanho web/mobile
@CenarioUm
  Cenário: 01 Abordagem Padrao WEB- Pesquisa por palavras-chave(inserir palavras-chave na caixa de pesquisa para encontrar artigos relacionados a busca)
    Dado que acesso a web com sucesso
    E visualizo e clico na lupa de busca
    E insiro no campo de busca o valor "Investidores"
    Quando clico em Pesquisar
    Então valido meu resultado de busca
@CenarioDois
  Cenário: 02 Abordagem Padrao MOBILE - Pesquisa por palavras-chave(inserir palavras-chave na caixa de pesquisa para encontrar artigos relacionados a busca)
    Dado que acesso a mobile com sucesso
    E clico no menu hamburguer
    E insiro no campo de busca o valor "Investidores" em modo mobile
    Quando clico em Pesquisar em modo mobile
    Então valido meu resultado de busca mobile
    E poaska