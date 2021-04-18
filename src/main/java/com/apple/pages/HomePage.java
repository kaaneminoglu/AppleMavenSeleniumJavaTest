package com.apple.pages;

import com.apple.base.BasePage;
import com.apple.services.enums.MenuName;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    private final By btnSearch = By.id("ac-gn-link-search");
    private final By txtSearch = By.id("ac-gn-searchform-input");
    private final By lstSearch = By.xpath(".//div[@id='explore-tab']//div[@class='as-explore-curated']/div");
    private final By lblFooter = By.id("ac-globalfooter");
    private final By lstMenu = By.xpath(".//ul[@class='ac-gn-list']/li/a");
    private final By lstSubMenu = By.xpath("//*[@id='chapternav']/div/ul/li/a");
    private final By btnMac = By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']");
    private final By btnIpad = By.xpath("//a[@class='ac-gn-link ac-gn-link-ipad']");
    private final By btnIphone = By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']");
    private final By btnWatch = By.xpath("//a[@class='ac-gn-link ac-gn-link-watch']");
    private final By btnTv = By.xpath("//a[@class='ac-gn-link ac-gn-link-tv']");
    private final By btnMusic = By.xpath("//a[@class='ac-gn-link ac-gn-link-music']");
    private final By btnDestek = By.xpath("//a[@class='ac-gn-link ac-gn-link-support']");

    public void clickMenuItem(MenuName subMenuName) throws Exception {
        By clickableItem;
        try {
            switch (subMenuName) {
                case Mac:
                    clickableItem = btnMac;
                    break;
                case iPad:
                    clickableItem = btnIpad;
                    break;
                case iPhone:
                    clickableItem = btnIphone;
                    break;
                case Watch:
                    clickableItem = btnWatch;
                    break;
                case TV:
                    clickableItem = btnTv;
                    break;
                case Music:
                    clickableItem = btnMusic;
                    break;
                case Destek:
                    clickableItem = btnDestek;
                    break;
                case Search:
                    clickableItem = btnSearch;
                    break;
                default:
                    throw new Exception("Menu item name is not correct");
            }
            super.clickWebElement(clickableItem);

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void searchText(String searchText) throws Exception {
        try {
            super.sendKeysWebElement(txtSearch, searchText);
            super.sendKeysWebElement(txtSearch, Keys.ENTER);
            super.checkTitle(searchText + " - Apple (TR)");
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void checkSearchList() throws Exception {
        try {
            List<WebElement> searchList = super.listWebElements(lstSearch);
            if (searchList.size() != 3) {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void scrollToFooter() throws Exception {
        try {
            super.scrollToWebElement(lblFooter);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void menuCheck(String[] menuNameList) throws Exception {
        try {
            super.checkWebList(lstMenu, menuNameList);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void subMenuCheck(String[] subMenuNameList) throws Exception {
        try {
            super.checkWebList(lstSubMenu, subMenuNameList);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
