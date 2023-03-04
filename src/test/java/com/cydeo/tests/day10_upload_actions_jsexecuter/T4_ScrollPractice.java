package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_ScrollPractice {

    @Test
    public void scrolTest(){

//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

//3- Scroll down to “Powered by CYDEO”

        Actions actions=new Actions(Driver.getDriver());
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO")) ;


//4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeoLink).perform();

        //1- Continue from where the Task 4 is left in the same test.




//2- Scroll back up to “Home” link using PageUP button

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();
        //Driver.getDriver().close();
        Driver.closeDriver();
    }


    @Test
    public void  Test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");








    }




}
