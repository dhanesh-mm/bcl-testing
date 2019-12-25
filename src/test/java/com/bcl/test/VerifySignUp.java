package com.bcl.test;

import com.bcl.config.BrowserFactory;
import com.bcl.dataprovider.SignUpDP;
import com.bcl.pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class VerifySignUp {

    public static final String SIGNUP_PAGE = "https://www.cgcx.io/signup";
    WebDriver driver = BrowserFactory.startBrowser("chrome");

    @Test(dataProviderClass = SignUpDP.class, dataProvider = "SignUpParams")
    public void verifySignUpPage(String uname, String pass,String confirmPass, String referralCode) throws InterruptedException {

        driver.get(SIGNUP_PAGE);
        SignUpPage signUpPage = PageFactory.initElements(driver,SignUpPage.class);
        signUpPage.SignUp(uname,pass,confirmPass,referralCode);
        Thread.sleep(10000);
        Assert.assertTrue(true);
    }


    @AfterClass
    public void tearDown() throws InterruptedException {

        driver.quit();
    }
}
