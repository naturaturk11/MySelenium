package com.cydeo.tests.day6_Alerts_ifarmes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

       //@Ignore   this is method which skips the test we test to the next one
   @Test
    public void iframeTest(){

        //we need to switch drivers focus to iframe
       //option1:switching toiframe using id
       driver.switchTo().frame(0);

       //driver.switchTo().frame(0);  this is other option used frame.int and index of frame
       //to know what is the index of the iframe we should checek in search button how many iframe there in html


       //locate the p tag
       WebElement yourContentGoesText= driver.findElement(By.xpath("//p"));

       Assert.assertTrue(yourContentGoesText.isDisplayed());

       //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
       //to be able to verify to the header ,we must switch back main html"
       driver.switchTo().parentFrame();
       WebElement headerText=driver.findElement(By.xpath("//h3"));

       //assertion of header text
       Assert.assertTrue(headerText.isDisplayed());


   }





}
/*TC #4: Iframe practice

1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */