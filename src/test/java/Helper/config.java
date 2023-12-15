package Helper;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class config {
	    private static Properties properties;

	    private config() {
	    }

	    static {
	        try {
	            properties = new Properties();
	            FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Appium-mobile-test\\resources\\config.properties");
	            properties.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String getPropertyValue(String key) {
	        return properties.getProperty(key);
	    }
	}



