package test.generic;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GenericSteps {
	
	private GenericLogic genericLogic;
	
	public GenericSteps() {
		genericLogic = new GenericLogic();
	}
	
	@Given("^acesso o site da Advantage Online Shopping$")
	public void acessoSiteAdvantageOnlineShopping() {
		genericLogic.acessoSiteAdvantageOnlineShopping();
	}

	@When("^valido se estou na Home Page$")
	public void validoHomePage() {
		genericLogic.validoHomePage();
	}
	
	@And("^clico no menu de usuario$")
	public void clicoMenuUsuario() {
		genericLogic.clicoMenuUsuario();
	}
	
	@And("^clico em \"([^\"]*)\" por texto$")
	public void clicoPorTexto(String texto) {
		genericLogic.clicoPorTexto(texto);
	}
}