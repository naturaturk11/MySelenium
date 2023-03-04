package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //TODO THERE STH I HAVE TO DO İS FİNDİNG NEW METHOD
        //1-setup the browser driver
        WebDriverManager.chromedriver().setup();


        //2-Create instance of the selenium WebDriver
        //this line opening an empty browser
        WebDriver driver=new ChromeDriver();

        // this line will maximize the browser size
        //!!!!!!driver.manage().window().fullscreen(); this method may not work in windows
        driver.manage().window().maximize();


        //3- go to the given link
        driver.get("https://www.tesla.com");

        String currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //use  navigate .to()
        driver.navigate().to("https://www.google.com");

        //get the current title and url after getting the google page
        currentTitle=driver.getTitle();
        currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //get title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());


        // this will close the curently opened window
        driver.close();

        //this will close all of the opened windows
        driver.quit();





    }


}
