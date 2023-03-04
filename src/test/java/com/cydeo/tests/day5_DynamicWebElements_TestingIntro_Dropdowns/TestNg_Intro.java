package com.cydeo.tests.day5_DynamicWebElements_TestingIntro_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNg_Intro {

    @Test
    public void test1(){
        System.out.println("Test 1 is running...");
        //ASSERT EQUALS: compare 2 of the same things

        String actual="apple";
        String expected="apple";

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        System.out.println("Test 2 is running...");


        //AssertTrue
        String actual="apple";
        String expected="apple";

        Assert.assertTrue(actual.equals(expected));
    }


    @BeforeClass
    public void setUpMethod(){
        System.out.println("Before class is running");
    }

    @AfterClass
    public void  tearDownClass(){
        System.out.println("After class is running");
    }


    @BeforeMethod
    public void setupMethod(){
        System.out.println("Before method is running...!");
    }
    @AfterMethod
     public void tearDownMethod(){
         System.out.println("After method is running");
     }







}
