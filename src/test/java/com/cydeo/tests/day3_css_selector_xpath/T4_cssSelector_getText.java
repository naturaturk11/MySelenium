package com.cydeo.tests.day3_css_selector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get(" https://login1.nextbasecrm.com/?forgot_password=yes");


        WebElement resetPasswordButton= driver.findElement(By.cssSelector("button[value='Reset password']"));
        String expectedResetPasswordButton="Reset password";
        String actualResetPasswordButton=resetPasswordButton.getText();//care here why getText is selected watch 3.57 minutes

        System.out.println("actualResetPasswordButton = " + actualResetPasswordButton);
        System.out.println("expectedResetPasswordButton = " + expectedResetPasswordButton);

        if(actualResetPasswordButton.equals(expectedResetPasswordButton)){
            System.out.println("Reset Password Button verified");
        }else {
            System.out.println("Reset Password Button unverified!!!!!");
        }


    }
}
/*TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password */