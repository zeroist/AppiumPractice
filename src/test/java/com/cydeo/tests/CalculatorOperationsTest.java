package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorOperationsTest {
    AppiumDriver<MobileElement> driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, ",10.0");
        caps.setCapability(MobileCapabilityType.APP, " https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, caps);

    }

    @Test
    public void addTest() {
        MobileElement four=driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
        four.click();
        MobileElement plus=driver.findElement(MobileBy.AccessibilityId("plus"));
        plus.click();
        MobileElement five=driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        five.click();
        MobileElement equals=driver.findElement(MobileBy.AccessibilityId("equals"));
        equals.click();

        MobileElement result=driver.findElement(By.id("com.google.android.calculator:id/result_final"));

        System.out.println(result.getText());

        Assertions.assertEquals("9",result.getText());


        System.out.println();

    }

    @Test
    public void divideTest(){
        MobileElement n1=driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        n1.click();
        MobileElement n5=driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        n5.click();


        MobileElement plus=driver.findElement(MobileBy.AccessibilityId("divide"));
        plus.click();
        MobileElement five=driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        five.click();
        MobileElement equals=driver.findElement(MobileBy.AccessibilityId("equals"));
        equals.click();

        MobileElement result=driver.findElement(By.id("com.google.android.calculator:id/result_final"));

        System.out.println(result.getText());

        Assertions.assertEquals("3",result.getText());





    }

    @AfterEach
    public void cleanUp() {
        driver.closeApp();


    }

}
