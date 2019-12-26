package com.bcl.config;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Driver Configuration
 */
public class DriverConfig {

    public static void waitForPageLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            @NotNull
            public Boolean apply( WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState", new Object[0]).equals("complete");
            }
        };
        WebDriverWait wait = new WebDriverWait(driver, 30L);
        wait.until(pageLoadCondition);
    }

}
