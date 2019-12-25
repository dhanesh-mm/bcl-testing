package com.bcl.test;

import com.bcl.config.BrowserFactory;
import com.bcl.dataprovider.SignInDP;
import com.bcl.pages.HomePage;
import com.bcl.pages.SignInPage;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VerifySignIn {

    public static final String SIGNIN_PAGE = "https://www.cgcx.io/signin";
    WebDriver driver = BrowserFactory.startBrowser("chrome");

    @Test(dataProviderClass = SignInDP.class, dataProvider = "SigInParams")
    public void verifySignInPage(String uname, String pass) throws InterruptedException {

        driver.get(SIGNIN_PAGE);
        SignInPage signInPage = PageFactory.initElements(driver,SignInPage.class);
        signInPage.login(uname,pass);
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.cgcx.io/wallets");
    }


    @AfterClass
    public void tearDown() throws InterruptedException {

        driver.quit();
    }
}

