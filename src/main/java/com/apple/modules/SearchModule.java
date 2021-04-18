package com.apple.modules;

import com.apple.base.BaseClass;
import com.apple.pages.HomePage;

public class SearchModule extends BaseClass {

    public void search(String searchText) throws Exception {
        HomePage homePage = new HomePage();
        homePage.searchText(searchText);
        homePage.checkSearchList();
    }
}
