package com.apple.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void setup() {
    }

    @BeforeTest(alwaysRun = true)
    @Parameters("browser")
    public void setups(String browserName) throws Exception {
        switch (browserName) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver");
                driver = new ChromeDriver();
                break;
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", ".//driver/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver",
                        ".//driver/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case "Safari":
                driver = new SafariDriver();
                break;
            default:
                throw new Exception("Browser is not correct");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.navigate().to("https://www.apple.com.tr");
    }


    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        if (null != driver) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
