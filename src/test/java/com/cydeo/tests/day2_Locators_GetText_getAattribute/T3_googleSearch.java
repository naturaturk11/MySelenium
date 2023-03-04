package com.cydeo.tests.day2_Locators_GetText_getAattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_googleSearch {
    public static void main(String[] args) {

        //111111  FİRSTLY MUST WRİTTEN THREE PHASES
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //driver.manage().window().fullscreen(); despite both has same action maximize is preferable

        //2- Go to: https://google.com
        driver.get("https://google.com");

         //3- Write “apple” in search box
        //4- Click google search button
        WebElement googleSearchBox=driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);
        //                                             !!!!!!!OPEN THE ANALYZED PAGE

        //5- Verify title:
        //Expected: Title should start with “apple” word*/

        String expectedInTitle="apple";
        String actualTitle=driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }

    }
}
/*TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word*/