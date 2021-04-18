package com.apple.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

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

    protected void checkTitle(String title) throws Exception {
        if (Objects.equals(driver.getTitle(), title)) return;
        throw new Exception();
    }

    protected void checkWebList(By listlocator, String[] checkList) throws Exception {
        List<WebElement> webList = listWebElements(listlocator);
        for (int i = 0; i < webList.size(); i++) {
            if (!webList.get(i).getText().trim().contains(checkList[i])) {
                throw new Exception();
            }
        }
    }
}
