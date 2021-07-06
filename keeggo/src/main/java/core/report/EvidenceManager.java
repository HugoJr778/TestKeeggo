package core.report;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.google.common.io.Files;

import core.utils.properties.Project;
import cucumber.api.Scenario;

public class EvidenceManager {
	
	private static final String EXTENSION = ".png";
	
	private EvidenceManager() {}
	
	public static void takeScreenShot(Scenario scenario, WebDriver driver) {
		try {
			Thread.sleep(3000);
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			Files.copy(scrShot.getScreenshotAs(OutputType.FILE), getFilePathDest(scenario));
		} catch (WebDriverException | IOException e) {
			System.out.println(e + e.getMessage());
		} catch (InterruptedException e) {
			System.out.println(e + e.getMessage());
			Thread.currentThread().interrupt();
		}
	}
	
	private static File getFilePathDest(Scenario scenario) {
		File pathEvi = new File(Project.getProperty().getPathEvidences() +  File.separator + 
				new SimpleDateFormat("dd.MM.yyyy").format(new Date()) +  File.separator + scenario.getStatus());
		if(!pathEvi.exists())
			pathEvi.mkdirs();
		return new File(pathEvi.getAbsolutePath(), scenario.getName() + EXTENSION);
	}
}