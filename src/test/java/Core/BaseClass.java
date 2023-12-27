package Core;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    protected static AppiumDriver driver;
    
    public static AppiumDriver initializeDriver() throws MalformedURLException {
    	DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "vivo 1820");
        cap.setCapability("udid", "R8RCHI45EYIF8SQC");
        cap.setCapability("platformName", "android");
        cap.setCapability("platformVersion", "8.1.0");
        cap.setCapability("appPackage", "com.raffoluxmobile");
        cap.setCapability("appActivity", "com.raffoluxmobile.MainActivity");
        cap.setCapability("noReset", true);
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
         driver = new AppiumDriver(url,cap);
        return driver;
    }
}
//OPPOF7
/*DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability("deviceName", "OppF7");
cap.setCapability("udid", "5LEUKVTSJ75L89IF");
cap.setCapability("platformName", "android");
cap.setCapability("platformVersion", "10");
// cap.setCapability("appPackage", "com.coloros.calculator");
// cap.setCapability("appActivity", "com.android.calculator2.Calculator");
cap.setCapability("appPackage", "com.raffoluxmobile");
cap.setCapability("appActivity", "com.raffoluxmobile.MainActivity");
cap.setCapability("noReset", true);
URL url = new URL("http://0.0.0.0:4723/wd/hub");
 driver = new AppiumDriver(url,cap);
return driver;*/