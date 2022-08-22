package com.cydeo.tests;

import com.cydeo.utils.ConfigurationReader;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EtsyChromeTest extends WebTestBase {

    @Test
    public void etsySearchTest() throws InterruptedException {
        driver.get("https://www.etsy.com");
        Thread.sleep(3000);

        WebElement searchField=driver.findElement(By.id("global-enhancements-search-query"));
        searchField.sendKeys("wooden spoon"+Keys.ENTER);

        WebElement searchResultNumber=driver.findElement(By.xpath("//span[@class=\"wt-display-inline\"]/span"));

        System.out.println(searchResultNumber.getText());

        WebElement signInButton = driver.findElement(By.xpath("//a[@href=\"https://www.etsy.com/signin/router?ref=hdr-signin&from_action=signin-header&from_page=https%3A%2F%2Fwww.etsy.com%2Fsearch\"]"));
        signInButton.click();

        WebElement userInput = driver.findElement(By.id("join_neu_email_field"));

        userInput.sendKeys(ConfigurationReader.getProperty("email")+Keys.ENTER);

        WebElement passInput = driver.findElement(By.id("join_neu_password_field"));

        userInput.sendKeys(ConfigurationReader.getProperty("password")+Keys.ENTER);



    }

    @Test
    public void loginTest() throws InterruptedException {


    }



}
