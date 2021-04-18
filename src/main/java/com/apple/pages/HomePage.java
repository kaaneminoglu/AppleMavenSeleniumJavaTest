package com.apple.pages;

import com.apple.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BaseClass {

    private final By btnSearch = By.id("ac-gn-link-search");
    private final By txtSearch = By.id("ac-gn-searchform-input");
    private final By lstSearch = By.xpath(".//div[@id='explore-tab']//div[@class='as-explore-curated']/div");
    private final By lblFooter = By.id("ac-globalfooter");
    private final By lstMenu = By.xpath(".//ul[@class='ac-gn-list']/li/a");

    public void clickSearch() throws Exception {
        try {
            driver.findElement(btnSearch).click();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void searchText(String searchText) throws Exception {
        try {
            driver.findElement(txtSearch).sendKeys(searchText);
            driver.findElement(txtSearch).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void checkSearchList() throws Exception {
        try {
            List<WebElement> searchList = driver.findElements(lstSearch);
            if (searchList.size() != 3) {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void scrollToFooter() throws Exception {
        try {
            driver.findElement(lblFooter).getLocation();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void menuCheck(String[] menuNameList) throws Exception {
        try {
            List<WebElement> menuList = driver.findElements(lstMenu);
            for (int i = 0; i < menuList.size(); i++) {
                if (!menuList.get(i).getText().trim().equals(menuNameList[i])) {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
