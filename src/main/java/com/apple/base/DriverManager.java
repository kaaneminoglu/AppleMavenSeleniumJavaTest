package com.apple.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;

    @Parameters("browser")
    public void setupBrowser(String browserName, String url) throws Exception {
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
        driver.navigate().to(url);
    }

    public void quitDriver() {
        if (null != driver) {
            driver.quit();
        }
    }

    public void fullScreen() {
        driver.manage().window().fullscreen();
    }
}
