package core.utils.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class GetProperty {
	
	private GetProperty() {}
	
	protected static Properties getProp(String path) {
		Properties properties = new Properties();
		try(FileInputStream in = new FileInputStream(path)) {
			properties.load(in);
		} catch (IOException e) {
			System.out.println(e + e.getMessage());
		}
		return properties;
	}
}