package com.cydeo.tests.Exercises1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertTrue;

public class Exe8 {



    @Test
    public void hardAssertion(){


        Assert.assertEquals("ayyüzlü","ayy");
        System.out.println("After Assertion failed");
        assertTrue("oranger".equals("or"));
        System.out.println("After Assertion failed");
    }

        @Test
        public void softAssertion(){

            SoftAssert softAssert=new SoftAssert();
            softAssert.assertEquals("ayyüzlü","ayy");

            System.out.println("After Assertion failed");
            softAssert.assertTrue("Orange".equals("Oranger"));
            System.out.println("After Assertion failed");

            softAssert.assertAll();


        }


}
