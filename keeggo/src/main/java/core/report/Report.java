package core.report;

import core.webdriver.chrome.Chrome;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Report extends Chrome {
	
	private Scenario scenario;
	
	@Before
	public void before(Scenario scenario) {
		System.out.println("---------- Start Automation ----------");
		this.scenario = scenario;
	}
	
	@After
	public void tearDown() {
		EvidenceManager.takeScreenShot(scenario, getDriver());
		System.out.println("-------- Finishing Automation --------");
		getDriver().close();
		getDriver().quit();
	}
}