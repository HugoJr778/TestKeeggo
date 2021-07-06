package test.generic;

import org.openqa.selenium.By;

public class GenericPage {
	
	protected By validaHomePage() {return By.xpath("//label[text()=' © Advantage Inc, 2021. Release 3.1 ']");} 
	protected By menuUsuario() {return By.id("menuUser");}
}