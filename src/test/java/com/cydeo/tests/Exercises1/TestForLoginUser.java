package com.cydeo.tests.Exercises1;

import com.cydeo.pages.LoginUserWithCorrectEmailAndPassword;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForLoginUser {



    @Test
    public void LoginUser(){
        Driver.getDriver().get(ConfigurationReader.getProperty("AE.url"));

        LoginUserWithCorrectEmailAndPassword loginUserWithCorrectEmailAndPassword=new LoginUserWithCorrectEmailAndPassword();

        Assert.assertTrue(loginUserWithCorrectEmailAndPassword.homePage.isDisplayed());

        loginUserWithCorrectEmailAndPassword.signUpLogInButton.click();


        Assert.assertTrue(loginUserWithCorrectEmailAndPassword.Login_to_your_account.isDisplayed());
        Faker faker=new Faker();
        loginUserWithCorrectEmailAndPassword.email.sendKeys(faker.internet().emailAddress());
        loginUserWithCorrectEmailAndPassword.password.sendKeys(faker.internet().password());
        loginUserWithCorrectEmailAndPassword.loginButton.click();








    }


}
