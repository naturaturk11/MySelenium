package com.cydeo.tests.day9_javafaker_testBase_DriverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {



    @Test
    public void test1(){

        Faker faker=new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"312-###-####\") = " + faker.numerify("312-###-####"));
        System.out.println("faker.letterify(\"?p?-??p?\") = " + faker.letterify("?p?-??p?"));
        System.out.println("faker.bothify(\"##=#-##??-#??#-##??\") = " + faker.bothify("##=#-##??-#??#-##??"));
        //some changes donefor converting the"-" to"_" which gave mistake
        System.out.println("faker.finance().creditCard().replaceAll(\"-\",\"_\") = " + faker.finance().creditCard().replaceAll("-", "_"));
        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\",\"Muhtar\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));

    }
}
