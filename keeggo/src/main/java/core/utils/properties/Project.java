package core.utils.properties;

import java.util.Properties;

public final class Project {
	
	private static final String PATH_PROPERTIES = "./project.properties";
	
	private String advantageShopping;
	private String chromeDriverLocation;
	private String pathEvidences;
	
	private static Project projectProperties;
	
	private Project() {}
	
	public static Project getProperty() {
		if(projectProperties == null) {
			projectProperties = new Project();
			Properties properties = GetProperty.getProp(PATH_PROPERTIES);
			projectProperties.advantageShopping = properties.getProperty("keeggo.advantage.shopping");
			projectProperties.chromeDriverLocation = properties.getProperty("keeggo.chromedriver");
			projectProperties.pathEvidences = properties.getProperty("keeggo.folder.evidences");
		}
		return projectProperties;
	}
	
	public String getAdvantageShopping() {
		return advantageShopping;
	}

	public String getChromeDriverLocation() {
		return chromeDriverLocation;
	}

	public String getPathEvidences() {
		return pathEvidences;
	}
}