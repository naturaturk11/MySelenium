package com.cydeo.tests.day11_Actions_Practices;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Drag_and_drop {

    @Test
    public void dragDropTest(){

         
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/");

       // lOCATE "Accept Cookies" button and click

        WebElement cookiesButton=Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        cookiesButton.click();

       // WebElement surweyOptionsmallButton=Driver.getDriver().findElement(By.xpath(""));
        //2. Drag and drop the small circle to bigger circle.

        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        //WebElement bigCircle=Driver.getDriver().findElement(By.xpath("//div[@class='k-header']"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions=new Actions(Driver.getDriver());

        //actions.dragAndDrop(smallCircle,bigCircle).perform();
        BrowserUtils.sleep(5);
        actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();

         //survey table
        BrowserUtils.sleep(15);

        WebElement surveyButton=Driver.getDriver().findElement(By.xpath("//form[@id='qual_ol_ans_box']//div[3]"));
        surveyButton.click();

        //3. Assert:
        String actualText=bigCircle.getText();
        System.out.println("actualText = " + actualText);

        String expectedText="You did great!";
        System.out.println("expectedText = " + expectedText);
        Assert.assertEquals(actualText,expectedText);

       // Text in big circle changed to: “You did great!”




    }
}
