package com.apple.modules;

import com.apple.base.BaseClass;
import com.apple.pages.HomePage;
import com.apple.services.enums.MenuName;

public class HomeModule extends BaseClass {

    public void checkMenu(String[] menuNameList) throws Exception {
        HomePage homePage = new HomePage();
        homePage.menuCheck(menuNameList);
    }

    public void checkSubMenu(String[] subMenuNameList) throws Exception {
        HomePage homePage = new HomePage();
        homePage.subMenuCheck(subMenuNameList);
    }

    public void clickMenuItem(MenuName subMenuName) throws Exception {
        HomePage homePage = new HomePage();
        homePage.clickMenuItem(subMenuName);
    }
}
