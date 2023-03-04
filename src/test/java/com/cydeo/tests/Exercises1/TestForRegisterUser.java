package com.cydeo.tests.Exercises1;

import com.cydeo.pages.RegisterUserWithExistingEmail;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestForRegisterUser {

    RegisterUserWithExistingEmail registerUserWithExistingEmail=new RegisterUserWithExistingEmail();

    @Test
    public void TestForRegisterUser(){

        Driver.getDriver().get(ConfigurationReader.getProperty("AE.url"));
        Faker faker=new Faker();
        registerUserWithExistingEmail.homePage.isDisplayed();
        registerUserWithExistingEmail.signUpLoginButton.click();




        registerUserWithExistingEmail.newUserSignUpSign.isDisplayed();
        String name="Hasan dogru";
        registerUserWithExistingEmail.name.sendKeys(name);
       String email="hasan1##i#@gmail.com";
        registerUserWithExistingEmail.email.sendKeys(email);
        registerUserWithExistingEmail.signupButton.click();

        registerUserWithExistingEmail.enterAccInfo.isEnabled();


        registerUserWithExistingEmail.title.click();
        registerUserWithExistingEmail.password.sendKeys(faker.internet().password());

        Select day=new Select(registerUserWithExistingEmail.dayOfBirthInfo);
        day.selectByIndex(4);

        Select month=new Select(registerUserWithExistingEmail.monthOfBirthInfo);
        month.selectByIndex(4);

        Select year=new Select(registerUserWithExistingEmail.yearsOfBirthInfo);
        year.selectByValue("1998");

        registerUserWithExistingEmail.receiveSpecialOffers.click();
        registerUserWithExistingEmail.selectCheckBox.click();
        registerUserWithExistingEmail.firstName.sendKeys("Hasan");
        registerUserWithExistingEmail.lastName.sendKeys("dogru");
        registerUserWithExistingEmail.companyName.sendKeys(faker.company().name());
        registerUserWithExistingEmail.adress1.sendKeys(faker.address().streetAddress());
        registerUserWithExistingEmail.adress2.sendKeys(faker.address().buildingNumber());
        registerUserWithExistingEmail.country.sendKeys(faker.country().name());
        registerUserWithExistingEmail.state.sendKeys(faker.address().state());
        registerUserWithExistingEmail.city.sendKeys(faker.address().city());
        registerUserWithExistingEmail.zipCode.sendKeys(faker.address().zipCode());
        registerUserWithExistingEmail.mobileNumber.sendKeys(faker.phoneNumber().phoneNumber());
        registerUserWithExistingEmail.createAccount.click();
        registerUserWithExistingEmail.verifyOfAccount.isDisplayed();
        registerUserWithExistingEmail.continueButton.click();






    }


}
