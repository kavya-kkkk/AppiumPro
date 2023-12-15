package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import Core.BaseClass;
import Core.ElementActions;

public class LoginPageClass extends BaseClass {
    private By usernameField = By.xpath("//android.widget.EditText[@text=\"enter your email address\"]");
    private By passwordField = By.xpath("//android.widget.EditText[@text=\"password \"]");
    private By loginButton = By.xpath("(//android.widget.TextView[@text=\"Sign in\"])[3]");

    private ElementActions elementActions;

    public LoginPageClass(AppiumDriver driver) {
        super();
        this.elementActions = new ElementActions(driver);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isElementVisibleAndEnabled(By by) {
        return elementActions.isElementVisibleAndEnabled(by);
    }

    public boolean isUsernameFieldVisibleAndEnabled() {
        return isElementVisibleAndEnabled(usernameField);
    }

    public boolean isPasswordFieldVisibleAndEnabled() {
        return isElementVisibleAndEnabled(passwordField);
    }

    public boolean isLoginButtonVisibleAndEnabled() {
        return isElementVisibleAndEnabled(loginButton);
    }
}
