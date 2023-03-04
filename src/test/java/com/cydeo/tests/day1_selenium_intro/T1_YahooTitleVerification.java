package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_YahooTitleVerification {
    public static void main(String[] args) {

        //1-setup the browser driver
        WebDriverManager.chromedriver().setup();



        //2-Create instance of the selenium WebDriver
        //this line opening an empty browser
        WebDriver driver=new ChromeDriver();

        //make our page fullscreen
        driver.manage().window().maximize();


        // verify title
        //Expected :Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports &amp; Videos
        driver.get("https://www.yahoo.com");
        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";


        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as an expected,Verification PASSAD!");
        }else {
            System.out.println("Title is NOT as expected;verification failed");
        }


    }
}
