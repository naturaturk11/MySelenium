package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUserWithCorrectEmailAndPassword {

    public LoginUserWithCorrectEmailAndPassword(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="(//a[@href='/'])[2]" )
    public WebElement homePage;

    @FindBy(xpath ="//ul[@class='nav navbar-nav']//li[4]" )
    public WebElement signUpLogInButton;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement Login_to_your_account;

    @FindBy(css = "input[type='email']")
    public WebElement email;

    @FindBy(css = "input[type='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButton;













}
