package com.bcl;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInPage {

    public WebDriver driver;


    @BeforeClass
    public void testSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void verifySignInPage() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.cgcx.io/signin");
        WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
        WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement signin=driver.findElement(By.xpath("//div[@class='cr-sign-in-form__button-wrapper']"));

        email.sendKeys("bcltest780+2@gmail.com");
        password.sendKeys("Dhanesh@123");

        signin.click();
        Thread.sleep(5000);
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.cgcx.io/wallets");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        Thread.sleep(10000);
        driver.quit();
    }
}

