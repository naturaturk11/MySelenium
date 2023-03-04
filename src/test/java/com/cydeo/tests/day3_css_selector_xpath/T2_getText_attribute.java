package com.cydeo.tests.day3_css_selector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_attribute {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.navigate().to("https://login1.nextbasecrm.com/");



        //3
        WebElement rememberMeLabel=driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberLabel="Remember me on this computer";
        String actualRememberMeLabel=rememberMeLabel.getText();

        if (expectedRememberLabel.equalsIgnoreCase(actualRememberMeLabel)) {
            System.out.println(" Label verification passed");
        }else {
            System.out.println(" Label verification passed");
        }

       //4
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedforgotPasswordLink="Forgot your password?";
        String actualforgotPasswordLink=forgotPasswordLink.getText();

        if(actualforgotPasswordLink.equals(expectedforgotPasswordLink)){
            System.out.println("Forgot password verification link PASSED!");
        }else {
            System.out.println("Forgot password verification link FAILED!!!!!");
            System.out.println("actualforgotPasswordLink = " + actualforgotPasswordLink);
            System.out.println("expectedforgotPasswordLink = " + expectedforgotPasswordLink);
        }


        //5
            String expectedHref="forgot_password=yes";
            String actualHref=forgotPasswordLink.getAttribute("href");
        System.out.println("actualHref = " + actualHref);
        System.out.println("expectedHref = " + expectedHref);
        if (actualHref.contains(expectedHref)) {
            System.out.println("HREF Verification PASSED");
        }else {
            System.out.println("HREF Verification FAILED");
        }






    }
}/*TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes



PS: Inspect and decide which locator you should be using to locate web
elements. */
