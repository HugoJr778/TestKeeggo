package test.generic;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import core.webdriver.WebActions;

public class GenericLogic extends WebActions {
	
	private GenericPage page;
	
	public GenericLogic() {
		page = PageFactory.initElements(getDriver(), GenericPage.class);
	}
	
	public void acessoSiteAdvantageOnlineShopping() {
		setUp();
	}

	public void validoHomePage() {
		timeouts(page.validaHomePage());
		assertTrue(getDriver().findElement(page.validaHomePage()).isDisplayed());
		System.out.println("Home Page validada com SUCESSO");
	}

	public void clicoMenuUsuario() {
		click(page.menuUsuario());
		System.out.println("Clico no menu do Usuário");
	}

	public void clicoPorTexto(String texto) {
		click(findTextInScreen(texto, 1));
		System.out.println("Clico na primiera ocorrência no texto: " + texto);
	}
}