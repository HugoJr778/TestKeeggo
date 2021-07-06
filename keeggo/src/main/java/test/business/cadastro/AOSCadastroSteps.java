package test.business.cadastro;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AOSCadastroSteps {
	
	private AOSCadastroLogic cadastroLogic;
	
	public AOSCadastroSteps() {
		cadastroLogic = new AOSCadastroLogic();
	}
	
	@And("^preecho detalhes da conta com usuario e senha randomicamente e com email \"([^\"]*)\"$")
	public void preechoDetalhesContaUsuarioSenhaRandomicamenteComEmail(String email) {
		cadastroLogic.preechoDetalhesContaUsuarioSenhaRandomicamenteComEmail(email);
	}

	@And("^preecho dados pessoais com nome completo e numero de telefone randomico$")
	public void preechoDadosPessoaisNomeCompletoNumeroTelefoneRandomico() {
		cadastroLogic.preechoDadosPessoaisNomeCompletoNumeroTelefoneRandomico();
	}

	@And("^preecho endereco com \"([^\"]*)\" e com os outros campos randomico$")
	public void preechoEnderecoComOutrosCamposRandomico(String localidade) {
		cadastroLogic.preechoEnderecoComTodosCamposRandomico(localidade);
	}

	@And("^aceito os termos e condicoes do cadastro$")
	public void aceitoTermosCondicoesCadastro() {
		cadastroLogic.aceitoTermosCondicoesCadastro();
	}
	
	@Then("^valido a criacao da nova conta$")
	public void validoCriacaoNovaConta() {
		cadastroLogic.validoCriacaoNovaConta();
	}
}