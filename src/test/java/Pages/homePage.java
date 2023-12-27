package Pages;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import Core.BaseClass;
import Core.ElementActions;

public class homePage extends BaseClass {
    private By EnternowBtn= AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.View");
    private By carticon = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView");
    private By menuBtn = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
    private By allBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"All\"]");
    private By cashBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Cash\"]");
    private By techBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Tech\"]");
    private By holidaysBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Holidays\"]");
    private By carBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Car\"]");
    private By othersBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Other\"]");
    private By headerPointsBtn = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
    private ElementActions elementActions;
 
    public homePage(AppiumDriver driver) {
        super();
        this.elementActions = new ElementActions(driver);
    }

    public void enterUsername() {
        driver.findElement(EnternowBtn).click();
    }
 
    public void enterPassword() {
        driver.findElement(carticon).click();
    }

    public void clickLoginButton() throws InterruptedException {
    	Thread.sleep(1000);
    	System.out.println("element find");
        driver.findElement(menuBtn).click();
    }

    public boolean isElementVisibleAndEnabled(By by) {
        return elementActions.isElementVisibleAndEnabled(by);
    }

    public boolean isUsernameFieldVisibleAndEnabled() {
        return isElementVisibleAndEnabled(menuBtn);
    }

    public boolean isPasswordFieldVisibleAndEnabled() {
        return isElementVisibleAndEnabled(carticon);
    }

    public boolean isLoginButtonVisibleAndEnabled() {
        return isElementVisibleAndEnabled(EnternowBtn);
    }
}

