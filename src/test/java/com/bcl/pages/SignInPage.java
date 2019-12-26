package com.bcl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bcl.config.DriverConfig.waitForPageLoad;

/**
 * SignIn Page Model
 */
public class SignInPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//div[@class='cr-sign-in-form__button-wrapper']")
    WebElement signIn;

    public SignInPage(WebDriver driver) {
        this.driver = driver;

    }

    public void login(String emailStr, String passwordStr) {

        email.sendKeys(emailStr);
        password.sendKeys(passwordStr);
        signIn.click();
    }


}
