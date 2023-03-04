package com.cydeo.tests.Exercises1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe5 {

    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://library2.cybertekschool.com/login.html");

        WebElement userNAME=driver.findElement(By.id("inputEmail"));
        userNAME.sendKeys("incorrect@email.com"+ Keys.ENTER);

        WebElement password= driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password"+Keys.ENTER);


       String expectedAlert="Sorry, Wrong Email or Password";
      WebElement actualAlert=driver.findElement(By.className("alert-danger"));
      if(actualAlert.equals(expectedAlert)){
          System.out.println("Passed");
      }else {
          System.out.println("Failed");
      }









    }






}/*TC #4: Library verifications
        1. Open Chrome browser
        2. Go to http://library2.cybertekschool.com/login.html
        3. Enter username: “incorrect@email.com”
        4. Enter password: “incorrect password”
        5. Verify: visually “Sorry, Wrong Email or Password”
        displayed
*/