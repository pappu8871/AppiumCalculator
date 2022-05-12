package com.bridgelabz.appium.demo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDemo {
public static void main(String[]args)throws MalformedURLException{

    DesiredCapabilities cap = new DesiredCapabilities();

    cap.setCapability("deviceName","emulator-5554");
    cap.setCapability("platformName","Android");
    cap.setCapability("platformVersion","9.0");
    cap.setCapability("appPackage","com.android.calculator2");
    cap.setCapability("appActivity","com.android.calculator2.Calculator");

   AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
   System.out.println("Device time :" + driver.getDeviceTime());
   driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
   driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"plus\"]")).click();
   driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
   String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
   System.out.println("Result" +   result);

}
}
