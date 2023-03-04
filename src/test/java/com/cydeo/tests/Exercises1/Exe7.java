package com.cydeo.tests.Exercises1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe7 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com ");

        if(driver.getTitle().equals("Giriş Yap veya Kaydol")){
            System.out.println("Title is verified");
        }else {
            System.out.println("Title is unverified");
        }

        Thread.sleep(5000);

        driver.close();






    }
}

/*TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook - Giriş Yap veya Kaydol” */
