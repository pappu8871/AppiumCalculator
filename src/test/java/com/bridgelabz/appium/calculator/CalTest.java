package com.bridgelabz.appium.calculator;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class CalTest {
    public static AndroidDriver driver;

    @BeforeTest
    public void launchBrowser() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        System.out.println("Device time :" + driver.getDeviceTime());

    }

    @Test (priority = 1)
    public void addition() {
        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"plus\"]")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        System.out.println("Result of addition " + result);
        Assert.assertEquals(result, "2");
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        driver.findElement(By.id("com.android.calculator2:id/clr")).click();

    }

    @Test (priority = 2)
    public void subtraction() {
        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"minus\"]")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        System.out.println("Result of subtraction " + result);
        Assert.assertEquals(result, "4");
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        driver.findElement(By.id("com.android.calculator2:id/clr")).click();
    }

    @Test (priority = 3)
    public void multiply() {
        driver.findElement(By.id("com.android.calculator2:id/digit_4")).click();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"multiply\"]")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        System.out.println("Result of multiply " + result);
        Assert.assertEquals(result, "20");
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        driver.findElement(By.id("com.android.calculator2:id/clr")).click();
    }

    @Test (priority = 4)
    public void division() {
        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"divide\"]")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        System.out.println("Result of division " + result);
        Assert.assertEquals(result, "3");
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        driver.findElement(By.id("com.android.calculator2:id/clr")).click();
    }
    @AfterTest
    public void terminate() {
        driver.quit();
        
    }
}
