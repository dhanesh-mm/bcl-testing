package com.bcl.test;

import com.bcl.config.BrowserFactory;
import com.bcl.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by pmanickam on 12/25/2019 at 10:31 AM
 */
public class VerifyHome {

    public static final String HOME_URL = "https://www.cgcx.io/";

    WebDriver driver = BrowserFactory.startBrowser("chrome");

    @Test
    public void verifyHomePageSignIn() {

        driver.get(HOME_URL);
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.OnClick(homePage.signIn);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.cgcx.io/signin");

    }

    @Test
    public void verifyHomePageSignUp() {

        driver.get(HOME_URL);
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.OnClick(homePage.signUp);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.cgcx.io/signup");

    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        driver.quit();
    }
}
