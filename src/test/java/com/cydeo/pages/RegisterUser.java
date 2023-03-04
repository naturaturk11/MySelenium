package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {

    public RegisterUser(){PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(xpath ="//button[.='Start']")
        public WebElement startButton1;

        @FindBy(css = "div#loading")
         public WebElement loadingBar1;

        @FindBy(css =  "#username")
        public WebElement inputUserName;
    }

