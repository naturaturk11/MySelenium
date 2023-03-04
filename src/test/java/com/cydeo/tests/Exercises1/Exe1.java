package com.cydeo.tests.Exercises1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://app.vytrack.com/user/login");



        //ENTER USERNAME PROVİDED:"abcd"
        WebElement UserName =driver.findElement(By.id("prependedInput"));

        UserName.sendKeys("abcd");

        //ENTER password PROVİDED:"abcd"
        WebElement password= driver.findElement(By.name("_password"));

        password.sendKeys("abcd");


        //5 seconds pause give
         Thread.sleep(5000);

         //Click on Login BUTTON
         WebElement logInButton=driver.findElement(By.name("_submit"));

         logInButton.click();


         //Verify the message"Invalid user name or password."
         WebElement alert=driver.findElement(By.className("alert"));//care about the gap if chose the classname you select only one character and care about other related character
         if(alert.getText().equals("Invalid user name or password.")){
             System.out.println("Message is passed");
         }else {
             System.out.println("Message is failed");
         }

         //verify the URL contains"vyttrack"
         String actualURL=driver.getCurrentUrl();
         if(actualURL.contains("vytrack")){
             System.out.println("Url verified");
         }else {
             System.out.println("URL unverified");
         }


        //click"Forgot your password?" link
        driver.findElement(By.className("control-group")).click();


         //verify title is "Forgot Password"
         if(driver.getTitle().equals("Forgot Password")){
             System.out.println("Test VERİFİED");
         }else {
             System.out.println("TEST UNVERİFİED");
         }


    }
}
