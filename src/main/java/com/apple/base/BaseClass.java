package com.apple.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass extends DriverManager {

    @BeforeTest(alwaysRun = true)
    @Parameters({"browser"})
    public void setups(String browserName) throws Exception {
        super.setupBrowser(browserName, "https://www.apple.com.tr");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        super.quitDriver();
    }
}
