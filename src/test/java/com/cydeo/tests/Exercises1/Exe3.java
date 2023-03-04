package com.cydeo.tests.Exercises1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe3 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.etsy.com");

        WebElement searchingButon= driver.findElement(By.name("search_query"));
        searchingButon.sendKeys("wooden spoon"+ Keys.ENTER);

        if(driver.getTitle().equals("Wooden spoon | Etsy")){
            System.out.println("Title VERİFİED");
        }else {
            System.out.println("Title is not verified");
        }








    }
}
/*C #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy” */