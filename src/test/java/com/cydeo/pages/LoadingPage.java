package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoadingPage {

    public LoadingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


        @FindBy(xpath = "//a[@href='/dynamic_loading/7']")
        public WebElement accesingtoExample7;

        @FindBy(xpath = "//strong[.='Done!']")
        public WebElement doneSign;

        @FindBy(xpath ="//img[@alt='square pants']")
         public WebElement imgOfPage;


}
