package com.bcl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * SignUp Page Model
 */
public class SignUpPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    WebElement confirmPassword;

    @FindBy(xpath = "//input[@placeholder='Referral Code']")
    WebElement referralCode;

    @FindBy(xpath = "//span[@class='cr-checkbox__checkitem']")
    WebElement termsAgreement;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void SignUp(String emailStr, String passwordStr, String ConfirmPasswordStr, String referralCodeStr) {

        email.sendKeys(emailStr);
        password.sendKeys(passwordStr);
        confirmPassword.sendKeys(ConfirmPasswordStr);
        referralCode.sendKeys(referralCodeStr);
        termsAgreement.click();
    }
}
