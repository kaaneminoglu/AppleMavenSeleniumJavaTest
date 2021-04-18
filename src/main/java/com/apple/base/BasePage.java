package com.apple.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage extends DriverManager {

    protected void clickWebElement(By locator) {
        driver.findElement(locator).click();
    }

    protected void sendKeysWebElement(By locator, CharSequence... var1) {
        driver.findElement(locator).sendKeys(var1);
    }

    protected List<WebElement> listWebElements(By locator) {
        return driver.findElements(locator);
    }

    protected void scrollToWebElement(By locator) {
        driver.findElement(locator).getLocation();
    }
}
