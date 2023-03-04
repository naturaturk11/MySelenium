package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadTest {


    @Test
   public void upload() throws InterruptedException {

        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get(ConfigurationReader.getProperty("upload.url"));

        //2. Find some small file from your computer, and get the path of it.
        String path="C:\\Users\\Lenovo\\.ms-ad";

        //3. Upload the file.
         WebElement fileUpload=Driver.getDriver().findElement(By.id("file-upload"));
         fileUpload.sendKeys(path);

        BrowserUtils.sleep(2);

          WebElement uploadButton=Driver.getDriver().findElement(By.className("button"));

          BrowserUtils.sleep(4);
          uploadButton.click();


          //4. Assert:
        //-File uploaded text is displayed on the page

        fileUpload.isDisplayed();
    }



}
