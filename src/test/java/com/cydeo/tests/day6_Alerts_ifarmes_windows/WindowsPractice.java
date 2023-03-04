package com.cydeo.tests.day6_Alerts_ifarmes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsPractice {
        WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
       // 2. Create new test and make set ups
        //3. Go to : https://practice.cydeo.com/windows
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows ");

    }
     @Test
    public void windowsTask(){

// Storing the main page's window handle as string is good practice for future re-usable purposes
         String mainHandle=driver.getWindowHandle();
         System.out.println("mainHandle = " + mainHandle);




//4. Assert: Title is “Windows”

         String expectedTitle="Windows";
         String  actualTitle=driver.getTitle();
         Assert.assertEquals(actualTitle,expectedTitle,"Title not matched");
         //adding message to the statement makes easy to understand where the mistakes are



         System.out.println("Title before click: "+ actualTitle);

         //5. Click to: “Click Here” link
         WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
         clickHereLink.click();


         //6. Switch to new Window.

         Set<String> allWindowsHandles=driver.getWindowHandles();
         for (String each:driver.getWindowHandles()){//when there are more than one window for loop is executed
             driver.switchTo().window(each);
             System.out.println("Current title switching windows: "+driver.getTitle());


         }

        //7. Assert: Title is “New Window”

         String expectedTitleAfterClick="New Window";
         actualTitle=driver.getTitle();//checking in which page we are after clicking


         Assert.assertEquals(actualTitle,expectedTitleAfterClick);

         System.out.println("Title after click: "+ actualTitle);

          //driver.switchTo().window(mainHandle);ifyou want to turn main page this formula is used


     }

@AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
}



}


/*TC #5: Window Handle practice

1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”

 */