package test.business.login;

import cucumber.api.java.en.And;

public class AOSLoginSteps {
	
	private AOSLoginLogic loginLogic;
	
	public AOSLoginSteps() {
		loginLogic = new AOSLoginLogic();
	}
	
	@And("^preecho o \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preechoUsuarioSenha(String usuario, String senha) {
	    loginLogic.preechoUsuarioSenha(usuario, senha);
	}
	
	@And("^clico em login$")
	public void clicoBtnLogin() {
		loginLogic.clicoBtnLogin();
	}
	
	@And("^valido o login com o \"([^\"]*)\"$")
	public void validoLogin(String usuario) {
		loginLogic.validoLogin(usuario);
	}
}