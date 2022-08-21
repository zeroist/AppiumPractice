package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTests {
    AppiumDriver<MobileElement> driver;
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps =new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,",10.0");
        caps.setCapability(MobileCapabilityType.APP," https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, caps);
        //System.out.println(driver.getTitle());
        System.out.println(driver.getDeviceTime());
        Assertions.assertEquals("android",driver.getPlatformName());

        Thread.sleep(4000);
         MobileElement clearElem=driver.findElement(MobileBy.AccessibilityId("clear"));

        System.out.println(clearElem.getText());

        Assertions.assertTrue(clearElem.isDisplayed());

        Assertions.assertEquals("AC",clearElem.getText());



        driver.closeApp();




    }
}
