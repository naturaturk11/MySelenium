package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserWithExistingEmail {

    public RegisterUserWithExistingEmail(){PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="(//a[@href='/'])[2]" )
    public WebElement homePage;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLoginButton;

    @FindBy(xpath ="//h2[.='New User Signup!']" )
    public WebElement newUserSignUpSign;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement name;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccInfo;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement title;

    @FindBy(xpath = "//input[@name='password']")
    public  WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement dayOfBirthInfo;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement monthOfBirthInfo;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement yearsOfBirthInfo;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement selectCheckBox;
    @FindBy(css = "input[name='optin']")
    public WebElement receiveSpecialOffers;
    @FindBy(css = "input[id='first_name']")
    public WebElement firstName;
    @FindBy(css = "input[id='last_name']")
    public WebElement lastName;

    @FindBy(css = "input[id='company']")
    public WebElement companyName;

    @FindBy(css = "input[id='address1']")
    public WebElement adress1;
    @FindBy(css = "input[id='address2']")
    public WebElement adress2;

    @FindBy(css = "select[id='country']")
    public WebElement country;

    @FindBy(css = "input[id='state']")
    public WebElement state;

    @FindBy(css = "input[id='city']")
    public WebElement city;

    @FindBy(css = "input[id='zipcode']")
    public WebElement zipCode;

    @FindBy(css = "input[id='mobile_number']")
    public WebElement mobileNumber;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement createAccount;
    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement verifyOfAccount;
    @FindBy(xpath = "(//a[@href='/'])[3]")
    public WebElement continueButton;









}
