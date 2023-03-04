package com.cydeo.tests.day6_Alerts_ifarmes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_2_3_Alert_Practice {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
       // 1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }
    @Test
    public void alert_Test1() throws InterruptedException {
       // 3. Click to “Click for JS Alert” button
        WebElement informationAlertButton= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
         informationAlertButton.click();
         Thread.sleep(2000);

         //to be able to click toAlert Ok bUTTON WE NEED TO SWİTCH TO aLERT İTSELF

        Alert alert=driver.switchTo().alert();
        //4. Click to OK button from the alert
        alert.accept();
        //alert.dismiss();
        //alert.sendKeys("hello");

        //5. Verify “You successfully clicked an alert” text is displayed.

         WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
         String expectedResultText="You successfully clicked an alert";
         String actualResulTtext=resultText.getText();
         Assert.assertTrue(actualResulTtext.equals(expectedResultText));

         //Assert.assertTrue(resultText.isDisplayed()); this is another option could be operated

    }
         @Test
         public void ConfirmationAlert(){


         }





}
/*TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.

TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.

TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered:  hello” text is displayed.
 */