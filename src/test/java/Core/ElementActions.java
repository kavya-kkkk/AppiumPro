package Core;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementActions {
    private AppiumDriver driver;

    public ElementActions(AppiumDriver driver) {
        this.driver = driver;
    }

    public boolean isElementVisibleAndEnabled(By by) {
        try {
            WebElement element = driver.findElement(by);
            return element.isDisplayed() && element.isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException | org.openqa.selenium.TimeoutException e) {
            return false;
        }
    }
}

