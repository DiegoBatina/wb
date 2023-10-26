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
