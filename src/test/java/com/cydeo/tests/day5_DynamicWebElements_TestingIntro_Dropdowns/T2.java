package com.cydeo.tests.day5_DynamicWebElements_TestingIntro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons ");

        //3. Click to “Hockey” radio button
        WebElement hoceyButton= driver.findElement(By.xpath("//input[@id='hockey']"));

       Thread.sleep(3000);
        hoceyButton.click();


        //4. Verify “Hockey” radio button is selected after clicking.

        System.out.println("hoceyButton.isSelected() = " + hoceyButton.isSelected());


    }



}
/*XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS  */