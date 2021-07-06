package core.webdriver;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import core.utils.properties.Project;
import core.webdriver.chrome.Chrome;

public abstract class WebActions extends Chrome {
	
	public void setUp() {
		setUpDriver(Project.getProperty().getChromeDriverLocation());
		getDriver().get(Project.getProperty().getAdvantageShopping());
		System.out.println("Inicializo o Chrome acessando o Advantage Online Shopping");
	}
	
	public void timeouts(By locator) {
		getWait().ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void click(By element) {
		timeouts(element);
		getDriver().findElement(element).click();
	}
	
	public void senKeys(By element, String info) {
		timeouts(element);
		getDriver().findElement(element).sendKeys(info);
	}
	
	public By findElementByName(Tag elemento, String conteudo, int index) {
		return By.xpath(String.format("(//%1$s[contains(@name,'%2$s')])[%3$d]", elemento.getValue(), conteudo, index));
	}
	
	public By findTextInScreen(String msg, int index) {
		return By.xpath(String.format("(//*[contains(text(),'%1$s')])[%2$d]", msg, index));
	}
	
	public void selectElementByText(By element, String value) {
		timeouts(element);
		new Select(getDriver().findElement(element)).selectByVisibleText(value);
	}
}