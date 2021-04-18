package com.apple.scenarios;

import com.apple.base.BaseClass;
import com.apple.modules.HomeModule;
import org.testng.annotations.Test;

public class AppleCheckMenu extends BaseClass {
    @Test(groups = {"RegressionGroup"})
    public void appleSearchTest() throws Exception {
        String[] menuNameList = {"Apple", "Mac", "iPad", "iPhone", "Watch", "TV", "Music", "Destek", ""};
        HomeModule homeModule = new HomeModule();
        homeModule.checkMenu(menuNameList);
    }
}
