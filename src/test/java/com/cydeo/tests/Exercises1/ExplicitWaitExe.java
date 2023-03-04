package com.cydeo.tests.Exercises1;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitExe {


    @Test
    public void testCase1(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading");
        Driver.getDriver().findElement(By.xpath("//a[@href='/dynamic_loading/4']")).click();
        WebElement helloWorld=Driver.getDriver().findElement(By.xpath("(//h4)[2]"));

        BrowserUtils.waitForInvisibilityOf(helloWorld);

        try {
            //assertFalse method will pass the test if the boolean value returned is: false
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            //Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());
            Assert.assertFalse(helloWorld.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }

    }
}
