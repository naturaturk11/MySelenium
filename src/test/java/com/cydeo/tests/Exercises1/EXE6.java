package com.cydeo.tests.Exercises1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXE6 {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com/inputs ");

         driver.findElement(By.className("row")).click();
         String actualTitle=driver.getTitle();
         String expectedTitle="Practice";

         if(actualTitle.equals(expectedTitle)){
             System.out.println("Verified");

           }else {
             System.out.println("Unverified");
           }





    }
}

/*TC #4: Practice Cydeo – Class locator practice
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/inputs
        3- Click to “Home” link
        4- Verify title is as expected:
        Expected: Practice

        PS: Locate “Home” link using “className” locator
        */
