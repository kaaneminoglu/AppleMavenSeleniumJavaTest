package com.apple.scenarios;

import com.apple.base.BaseClass;
import com.apple.modules.SearchModule;
import org.testng.annotations.Test;

public class AppleSearch extends BaseClass {
    @Test(groups = {"RegressionGroup"})
    public void appleSearchTest() throws Exception {
        SearchModule searchModule = new SearchModule();
        searchModule.search("iPhone 12");
    }
}
