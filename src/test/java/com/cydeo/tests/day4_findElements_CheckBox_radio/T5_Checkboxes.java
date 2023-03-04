package com.cydeo.tests.day4_findElements_CheckBox_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_Checkboxes {
    public static void main(String[] args) throws InterruptedException {





WebDriver driver= WebDriverFactory.getDriver("chrome");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("http://practice.cydeo.com/checkboxes");



//WE HAVE TO LOCATE THE CHECKBOX
 WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
 WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

 //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkBox1.isSelected(),expecting false = " + checkBox1.isSelected());



        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkBox2.isSelected(),expecting true = " + checkBox2.isSelected());


        //4. Click checkbox #1 to select it.

       Thread.sleep(2000);
         checkBox1.click();

        //5. Click checkbox #2 to deselect it.
         Thread.sleep(2000);
        checkBox2.click();

       //6. Confirm checkbox #1 is SELECTED.

        System.out.println("checkBox1.isSelected(),expecting true = " + checkBox1.isSelected());

        System.out.println("checkBox2.isSelected(),expecting false = " + checkBox2.isSelected());






    }}

/*Practice: Checkboxes
1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.




 */
