package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T3_HoverTest {

    @Test
    public void Hover1(){
//1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers ");
//2. Hover over to first image
        WebElement image1=Driver.getDriver().findElement(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(image1).perform();
        BrowserUtils.sleep(2);

        //3. Assert:
       //a. “name: user1” is displayed
       WebElement user1Name=Driver.getDriver().findElement(By.tagName("h5"));
        System.out.println("user1Name.isDisplayed() = " + user1Name.isDisplayed());
        BrowserUtils.sleep(2);
        //b. “view profile” is displayed

        WebElement viewProfileDisplayed1=Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[1]"));
        System.out.println("viewProfileDisplayed1.isDisplayed() = " + viewProfileDisplayed1.isDisplayed());
        BrowserUtils.sleep(2);

        //4. Hover over to second image
        WebElement image2=Driver.getDriver().findElement(By.xpath("((//img[@src='/img/avatar-blank.jpg'])[2])"));
        actions.moveToElement(image2).perform();
        BrowserUtils.sleep(2);

        //5. Assert:
         //a. “name: user2” is displayed
        WebElement user2Name=Driver.getDriver().findElement(By.xpath("(//h5)[2]"));
        System.out.println("user2Name.isDisplayed() = " + user2Name.isDisplayed());
        //b. “view profile” is displayed
        WebElement viewProfileDisplayed2=Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[2]"));
        System.out.println("viewProfileDisplayed2.isDisplayed() = " + viewProfileDisplayed2.isDisplayed());

        //6. Hover over to third image
        WebElement image3=Driver.getDriver().findElement(By.xpath("(((//img[@src='/img/avatar-blank.jpg'])[3]))"));
        actions.moveToElement(image3).perform();
        BrowserUtils.sleep(2);
        //7. Confirm:
        //a. “name: user3” is displayed
        WebElement user3Name=Driver.getDriver().findElement(By.xpath("(//h5)[3]"));
        System.out.println("user3Name.isDisplayed() = " + user3Name.isDisplayed());
       //b. “view profile” is displayed
        WebElement viewProfileDisplayed3=Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[3]"));
        System.out.println("viewProfileDisplayed3.isDisplayed() = " + viewProfileDisplayed3.isDisplayed());





    }
}
