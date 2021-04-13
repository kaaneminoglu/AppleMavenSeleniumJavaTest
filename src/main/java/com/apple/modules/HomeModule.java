package com.apple.modules;

import com.apple.base.BaseClass;
import com.apple.pages.HomePage;

public class HomeModule extends BaseClass {

    public void checkMenu(String[] menuNameList) throws Exception {
        HomePage homePage = new HomePage();
        homePage.menuCheck(menuNameList);
    }
}
