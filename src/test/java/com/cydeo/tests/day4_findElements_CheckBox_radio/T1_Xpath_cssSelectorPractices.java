package com.cydeo.tests.day4_findElements_CheckBox_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Xpath_cssSelectorPractices {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //easy way to create WebDriver driver= is to use short cut ...alt+enter after WebDriverFactory.getDriver("chrome");

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)


        //a.1 “Home” link  using cssSelector with  method1

        //a.2 “Home” link using cssSelector with  method2
        WebElement homePage1= driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homePage2= driver.findElement(By.cssSelector("a.nav-link"));

        //a.3 “Home” link  using cssSelector with  method3
        WebElement homePage3= driver.findElement(By.cssSelector("a[href='/']"));


        //b1. “Forgot password” header
        //locate header using cssSelector:locate parent element and move down to h2
        WebElement forgotPasswortLink1 = driver.findElement(By.cssSelector("div.example>h2"));


        //b2Locate header using Xpath:
         WebElement forgotPasswortLink2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));


        //c. “E-mail” text
        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));


        //d1. E-mail input box LOCATE INPUTBOX using xpath contains method
       WebElement inputBox= driver.findElement(By.xpath("//input[contains(@pattern,'[a-z0-9.')]"));


        //e. “Retrieve password” button
        //alternative xpath version were used
        WebElement retrieveElementButton= driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement retrieveElementButton1= driver.findElement(By.xpath("//button[@type='submit']"));

      //f. “Powered by Cydeo text
       WebElement poweredWithCydeo= driver.findElement(By.xpath("//div[@style='text-align: center;']"));

       //4. Verify all web elements are displayed.
       // !!!!!use isDisplayed method to verify

        System.out.println("homePage2.isDisplayed() = " + homePage2.isDisplayed());
        System.out.println("forgotPasswortLink1.isDisplayed() = " + forgotPasswortLink1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrieveElementButton1.isDisplayed() = " + retrieveElementButton1.isDisplayed());
        System.out.println("poweredWithCydeo.isDisplayed() = " + poweredWithCydeo.isDisplayed());
    }
}
/*XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
   */