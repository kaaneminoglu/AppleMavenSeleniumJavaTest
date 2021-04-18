package com.apple.scenarios;

import com.apple.base.BaseClass;
import com.apple.modules.HomeModule;
import com.apple.modules.SearchModule;
import com.apple.services.enums.MenuName;
import org.testng.annotations.Test;

public class AppleSearch extends BaseClass {
    @Test(groups = {"RegressionGroup"})
    public void appleSearchTest() throws Exception {
        SearchModule searchModule = new SearchModule();
        HomeModule homeModule = new HomeModule();
        homeModule.clickMenuItem(MenuName.Search);
        searchModule.search("iPhone 12");
    }
}
