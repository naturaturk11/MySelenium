package com.cydeo.tests.day4_findElements_CheckBox_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://practice.cydeo.com/abtest");


      //3- Locate “CYDEO” link, verify it is displayed.
        WebElement linkVerificationOfCYDEO= driver.findElement(By.xpath("//a[@target='_blank']"));
       linkVerificationOfCYDEO= driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("linkVerificationOfCYDEO.isDisplayed() = " + linkVerificationOfCYDEO.isDisplayed());


        //4- Refresh the page.
        driver.navigate().refresh();

        //5- Verify it is displayed, again.
        //!!!!!!!to avoid StaleElementReferenceException(second common made mistake) warning should be reassign the the web element reference look line 23
        linkVerificationOfCYDEO= driver.findElement(By.xpath("//a[@target='_blank']"));

//!!!!!!!when met any StaleElementReferenceException related problem in console check how can be handled..loook notes

    }


}
/*TC #6: StaleElementReferenceException Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.



This is a simple StaleElementReferenceException to understand what is
this exception and how to handle it. */