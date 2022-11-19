package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProp {
	
	Properties prop;
	
	public ConfigProp() throws Exception {
	
	FileInputStream fis = new FileInputStream("./TestData/config.properties");
	prop = new Properties();
	prop.load(fis);
	
	}
	
	public String getOrangeUrl() {
		return prop.getProperty("Orange_Url");
	}
	
	public String getNOPCommerceUrl() {
		return prop.getProperty("NOPCommerce_URL");
	}
	
	public String getBrowser() {
		return prop.getProperty("browser");
	}

}
	
	
