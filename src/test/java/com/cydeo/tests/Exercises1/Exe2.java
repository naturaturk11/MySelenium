package com.cydeo.tests.Exercises1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe2 {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.yahoo.com");


         if(driver.getTitle().equals("Yahoo")){
             System.out.println("Title is verified");
         }else {
             System.out.println("Title is not verified");
         }




    }
}
