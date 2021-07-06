package test.business.login;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import core.webdriver.Tag;
import core.webdriver.WebActions;

public class AOSLoginLogic extends WebActions {
	
	private AOSLoginPage page;
	
	public AOSLoginLogic() {
		page = PageFactory.initElements(getDriver(), AOSLoginPage.class);
	}

	public void preechoUsuarioSenha(String usuario, String senha) {
		senKeys(findElementByName(Tag.INPUT, page.userName, 1), usuario);
		senKeys(findElementByName(Tag.INPUT, page.senhaName, 1), senha);
		System.out.println("Usuário: " + usuario + " - Senha: " + senha);
	}
	
	public void clicoBtnLogin() {
		click(page.btnLogin());
		System.out.println("Clico para Logar");
	}

	public void validoLogin(String usuario) {
		By element = findTextInScreen(usuario, 2);
		timeouts(element);
		assertTrue(getDriver().findElement(element).isDisplayed());
		System.out.println("Usuário: '" + usuario + "' - Validado com SUCESSO");
	}
}