package com.cydeo.tests.Exercises1;

import com.cydeo.pages.RegisterUser;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exe10 {

  RegisterUser registerUser;
  @BeforeMethod
    public void setupMethod(){
      Driver.getDriver().get(ConfigurationReader.getProperty("library1.url"));
      RegisterUser registerUser=new RegisterUser();
  }
  @Test
  public void startButtonTest(){
    registerUser.startButton1.click();
    Assert.assertTrue(registerUser.startButton1.isDisplayed());

  }











}
