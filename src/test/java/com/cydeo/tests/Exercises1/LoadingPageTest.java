package com.cydeo.tests.Exercises1;

import com.cydeo.pages.LoadingPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoadingPageTest {








    @Test
    public void LoadingAccesingPageTest(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading");
        LoadingPage loadingPage=new LoadingPage();

        loadingPage.accesingtoExample7.click();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        Assert.assertTrue(loadingPage.doneSign.isDisplayed());
        Assert.assertTrue(loadingPage.imgOfPage.isEnabled());



    }
}
