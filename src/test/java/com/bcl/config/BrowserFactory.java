package com.bcl.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * BrowserFactory Class to create different drivers
 */
public class BrowserFactory {

   static WebDriver driver;

    public static WebDriver startBrowser(String browserName) {

        if(browserName.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();
        } else if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        return driver;
    }

}
