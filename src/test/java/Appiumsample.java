import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Appiumsample {
static AppiumDriver driver;

	public static void main(String[] args) throws Exception {
	     try {
		OpenCalculator();
	     }
	     catch(Exception exp) {
	    	System.out.println( exp.getCause());
	    	System.out.println( exp.getMessage());
	     } 
 
	 }// TODO Auto-generated method stub 
		
		public static <MobileElement> void OpenCalculator() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
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
       
        System.out.println("application start");
        
        By usernameField = By.xpath("//android.widget.EditText[@text=\"enter your email address\"]");
        By passwordField = By.xpath("//android.widget.EditText[@text=\"password \"]");
        By loginButton = By.xpath("(//android.widget.TextView[@text=\"Sign in\"])[3]");
        By menu = By.id("00000000-0000-01aa-ffff-ffff00000068");
        By logoutbtn = By.xpath("//android.widget.TextView[@text=\"Log out\"]");
        By homebtn = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup");
       //By loginButton = By.xpath("(//android.widget.TextView[@text=\"Sign in\"])[3]");
        
        // Perform login actions
       // driver.findElement(usernameField).sendKeys("gkrishnamurthy443@gmail.com");

        System.out.println("entered email");
        
       // driver.findElement(passwordField).sendKeys("1234567");
       
 
      //  System.out.println("entered password");
        
      //  driver.findElement(loginButton).click();
        
        Thread.sleep(6000);
        driver.findElement(menu).click();
        Thread.sleep(2000);
        driver.findElement(logoutbtn).click();
        System.out.println("logout");
        
        Thread.sleep(2000);
        driver.quit();
        System.out.println("diverclosed");
        
   }	
}