package com.bcl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bcl.config.DriverConfig.waitForPageLoad;

/**
 * Home Page Model
 */
public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//nav[@id='mainNav']//li[2]//a[1]")
    public WebElement signIn;

    @FindBy(xpath = "//span[contains(text(),'Signup')]")
    public WebElement signUp;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waitForPageLoad(driver);
    }

    public void OnClick(WebElement element) {

        element.click();

    }


}
