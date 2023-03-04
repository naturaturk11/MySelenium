package com.cydeo.tests.day4_findElements_CheckBox_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //Providing extra wait time for driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
         driver.get("https://practice.cydeo.com/abtest");


        //3- Locate all the links in the page.
        //windows:alt+enter and press enter and the formula comes on screen automatically
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));//a is tag


        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());
        System.out.println("allLinks.size() = " + allLinks.size());


        //5- Print out the texts of the links.

        for (WebElement each : allLinks) {
            System.out.println("Text of link: "+each.getText());//!!!!!!!!care  for usage of the getText
            System.out.println("HREF value: "+each.getAttribute("href"));
        }

        //6- Print out the HREF attribute values of the links

    }
}
/*TC #4: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
*/