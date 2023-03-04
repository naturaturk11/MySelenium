package com.cydeo.tests.day3_css_selector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2
        driver.navigate().to(" https://login1.nextbasecrm.com/");

        //!!!!!!!!!!tagName[attribute='value'] this is By.cssSelector usage formula


        //3"input[type='submit'] there are some alternative options could be selected
        WebElement signLogin=driver.findElement(By.cssSelector("input[value='Log In']"));

        //before executive the run action please check the selected value in the searching button
        // in page by calling alt+enter
        String expectedLogInButton="Log In";
        String actualLogInButton=signLogin.getAttribute("value");

        System.out.println("actualLogInButton = " + actualLogInButton);
        System.out.println("expectedLogInButton = " + expectedLogInButton);

        if(actualLogInButton.equals(expectedLogInButton)){
            System.out.println("LOG IN button verified");
        }else {
            System.out.println("LOG IN button unverified!!!!!!!");
        }

    }
}
/*TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In  */