package core.webdriver.chrome;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Chrome extends DataDriver {
	
	public void setUpDriver(String chromeDriverLocation) {
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		prefs.put("credentials_enable_service", false);
		prefs.put("password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		options.addArguments("--disable-extensions-file-access-check", "--disable-popup-blocking", 
				"--reduce-security-for-testing", "--start-maximized", "--use-fake-ui-for-media-stream");
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		setDriver(new ChromeDriver(options));
		getDriver().manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		setWait(new WebDriverWait(getDriver(), 30));
	}
}