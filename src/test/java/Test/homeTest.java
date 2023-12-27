package Test;

import Core.BaseClass;
import Pages.LoginPageClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;

public class homeTest {
    private AppiumDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeTest 
    public void setUp() throws Exception {
        extent = new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\HP\\eclipse-workspace\\Appium-mobile-test\\Report\\extent-report.html");
        extent.attachReporter(htmlReporter);

        driver = BaseClass.initializeDriver();
        test = extent.createTest("LoginTest", "Test case to validate login functionality");
    }

    @Test 
    public void loginTest() { 
        try {
            LoginPageClass loginPage = new LoginPageClass(driver);

//            test.log(Status.INFO, "Validating username field: " + loginPage.isUsernameFieldVisibleAndEnabled());
//            test.log(Status.INFO, "Validating password field: " + loginPage.isPasswordFieldVisibleAndEnabled());
            test.log(Status.INFO, "Validating login button: " + loginPage.isLoginButtonVisibleAndEnabled());

            loginPage.clickLoginButton();
//            test.log(Status.INFO, "Entered the email");
//            loginPage.enterPassword("1234567");
//            test.log(Status.INFO, "Entered the password");
//            loginPage.clickLoginButton();

            Thread.sleep(2000);
 
            // If the login was successful, mark the test as passed
            test.log(Status.PASS, "Login successful");
        } catch (Exception exp) {
            test.log(Status.FAIL, "Test case failed: " + exp.getMessage());
        }
    }

   // @AfterTest
    public void tearDown() {
        extent.flush();
        if (driver != null) {
            driver.quit();
            System.out.println("Driver closed");
        }
    }
}
