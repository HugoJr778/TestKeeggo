package core.webdriver.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataDriver {
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	
	protected DataDriver() {}
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver webDriver) {
		driver = webDriver;
	}
	public static WebDriverWait getWait() {
		return wait;
	}
	public static void setWait(WebDriverWait wait) {
		DataDriver.wait = wait;
	}
}