package com.bridgelabz.appium.calculator;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

    public class CalculatorTest {
    public AndroidDriver driver;

   @BeforeTest
    public void launchBrowser() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        System.out.println("Device time :" + driver.getDeviceTime());

    }

//   @Test
//    public void addition() {
//
//        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
//        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"plus\"]")).click();
//        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
//        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
//        System.out.println("Result of addition " + result);
//    }
//
//   @Test
//    public void subtraction() {
//        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
//        driver.findElement(By.xpath("com.android.calculator2:id/op_sub")).click();
//        driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
//        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
//        System.out.println("Result of subtraction " + result);
//    }
//
//    @Test
//    public void multiply() {
//        driver.findElement(By.id("com.android.calculator2:id/digit_4")).click();
//        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"multiply\"]")).click();
//        driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
//        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
//        System.out.println("Result of multiply " + result);
//    }
//
//    @Test
//    public void division() {
//        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
//        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"divide\"]")).click();
//        driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
//        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
//        System.out.println("Result of division " + result);
//    }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
}