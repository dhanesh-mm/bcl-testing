package com.bcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CgcxSignupPageTest {

    public WebDriver driver;


    @BeforeClass
    public void testSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void verifySignUpInPage() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.cgcx.io/signup");
        WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
        WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement confirmPassword=driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
        WebElement referralCode=driver.findElement(By.xpath("//input[@placeholder='Referral Code']"));
        WebElement login=driver.findElement(By.xpath("//div[@class='cr-sign-up-form__button-wrapper']"));
        email.sendKeys("Testing@gmail.com");
        password.sendKeys("Testing123456");
        confirmPassword.sendKeys("Testing123456");
        referralCode.sendKeys("1232322");
        driver.findElement(By.xpath("//span[@class='cr-checkbox__checkitem']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='root']/div[4]/div/div/form/div/div[2]/div[5]/div/div/div/div/iframe")).click();
        login.click();
       
        
    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        Thread.sleep(10000);
        driver.quit();
    }
}
