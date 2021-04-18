package com.apple.scenarios;

import com.apple.base.BaseClass;
import com.apple.modules.HomeModule;
import com.apple.services.enums.MenuName;
import org.testng.annotations.Test;

public class AppleCheckMenu extends BaseClass {
    @Test(groups = {"RegressionGroup"})
    public void appleSearchTest() throws Exception {
        String[] menuNameList = {"Apple", "Mac", "iPad", "iPhone", "Watch", "TV", "Music", "Destek", ""};
        String[] submenuNameList = {"MacBook Air","13 inç MacBook Pro", "16 inç MacBook Pro", "iMac", "Mac Pro", "Mac mini", "Karşılaştırın", "Pro Display XDR", "Aksesuarlar","Big Sur"};
        HomeModule homeModule = new HomeModule();
        homeModule.checkMenu(menuNameList);
        homeModule.clickMenuItem(MenuName.Mac);
        homeModule.checkSubMenu(submenuNameList);
    }
}
