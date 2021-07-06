package test.business.cadastro;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import core.utils.generator.Generator;
import core.webdriver.Tag;
import core.webdriver.WebActions;

public class AOSCadastroLogic extends WebActions {
	
	private String user;
	private AOSCadastroPage page;
	
	public AOSCadastroLogic() {
		page = PageFactory.initElements(getDriver(), AOSCadastroPage.class);
	}
	
	public void preechoDetalhesContaUsuarioSenhaRandomicamenteComEmail(String email) {
		user = "USER" + Generator.getNum(10000);
		String senha = Generator.getNum(100000) + "Keeggo";
		senKeys(findElementByName(Tag.INPUT, page.userName, 1), user);
		senKeys(findElementByName(Tag.INPUT, page.emailName, 1), email);
		senKeys(findElementByName(Tag.INPUT, page.senhaName, 1), senha);
		senKeys(findElementByName(Tag.INPUT, page.confirmarSenhaName, 1), senha);
		System.out.println("Usuário: " + user + " - Senha: " + senha + " - E-mail: " + email);
	}

	public void preechoDadosPessoaisNomeCompletoNumeroTelefoneRandomico() {
		String nome = Generator.getPalavra(7);
		String telefone = "119" + Generator.getNum(100000000);
		senKeys(findElementByName(Tag.INPUT, page.primeiroNomeName, 1), nome);
		senKeys(findElementByName(Tag.INPUT, page.ultimoNomeName, 1), nome);
		senKeys(findElementByName(Tag.INPUT, page.telefoneName, 1), telefone);
		System.out.println("Nome e Sobrenome: " + nome + " - Telefone: " + telefone);
	}

	public void preechoEnderecoComTodosCamposRandomico(String localidade) {
		String local = Generator.getPalavra(8);
		String cep = Generator.getNum(100000000);
		selectElementByText(findElementByName(Tag.SELECT, page.localizacaoName, 1), localidade);
		senKeys(findElementByName(Tag.INPUT, page.cidadeName, 1), local);
		senKeys(findElementByName(Tag.INPUT, page.enderecoName, 1), local);
		senKeys(findElementByName(Tag.INPUT, page.estadoName, 1), local);
		senKeys(findElementByName(Tag.INPUT, page.cepName, 1), cep);
		System.out.println("País: " + localidade + " - Local: " + local + " - CEP: " + cep);
	}

	public void aceitoTermosCondicoesCadastro() {
		click(findElementByName(Tag.INPUT, page.termosName, 1));
		System.out.println("Aceito os Termos e Condições");
	}

	public void validoCriacaoNovaConta() {
		By element = findTextInScreen(user, 2);
		timeouts(element);
		assertTrue(getDriver().findElement(element).isDisplayed());
		System.out.println("Usuário: '" + user + "' - Criado com SUCESSO");
	}
}