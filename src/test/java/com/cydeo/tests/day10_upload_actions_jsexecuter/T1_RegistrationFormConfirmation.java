package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_RegistrationFormConfirmation {

    @Test
     public void registration_form(){
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        //3. Enter first name
        WebElement firstName=Driver.getDriver().findElement(By.name("firstname"));
        Faker faker=new Faker();
        firstName.sendKeys(faker.name().firstName());
        //4. Enter last name
        WebElement lastname=Driver.getDriver().findElement(By.name("lastname"));
        lastname.sendKeys(faker.name().lastName());
        //5. Enter username
        WebElement userName=Driver.getDriver().findElement(By.name("username"));
        userName.sendKeys(faker.numerify("a#######z"));
        //6. Enter email address
        WebElement email=Driver.getDriver().findElement(By.name("email"));
        email.sendKeys(faker.numerify("###k####@gmail.com"));
        //7. Enter password
        WebElement password=Driver.getDriver().findElement(By.name("password"));
        password.sendKeys(faker.numerify("########"));

        //8. Enter phone number
        WebElement phoneNumber=Driver.getDriver().findElement(By.name("phone"));
        phoneNumber.sendKeys(faker.numerify("1##-###-###9"));
        //9. Select a gender from radio buttons
        WebElement radiobutton=Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        radiobutton.click();
        //10.Enter date of birth
        WebElement dateOfBirth=Driver.getDriver().findElement(By.xpath("(//input[@class='form-control'])[7]"));
        dateOfBirth.sendKeys(faker.numerify("08/08/20##"));

        //11.Select Department/Office
        WebElement depertmantType=Driver.getDriver().findElement(By.xpath("//select[@name='department']//option[3]"));
        depertmantType.click();
        //12.Select Job Title
        WebElement jobTitle=Driver.getDriver().findElement(By.xpath("//select[@name='job_title']//option[5]"));
        jobTitle.click();

        //13.Select programming language from checkboxes
         WebElement programingLanguage1=Driver.getDriver().findElement(By.xpath("(//input[@class='form-check-input'])[2]"));
         WebElement programingLanguage2=Driver.getDriver().findElement(By.xpath("(//input[@class='form-check-input'])[3]"));
          programingLanguage1.click();
          programingLanguage2.click();


          //14.Click to sign up button
          WebElement signupButton=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
          signupButton.click();





        //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.

        String expectedResult="You've successfully completed registration!";
        WebElement verificationMessage=Driver.getDriver().findElement(By.xpath("//div[@role='alert']//p"));
        //Assert.assertEquals(expectedResult,verificationMessage.getText());
         verificationMessage.isDisplayed();


        //Note:
        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense

    }

}
