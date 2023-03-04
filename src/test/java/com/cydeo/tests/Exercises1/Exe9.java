package com.cydeo.tests.Exercises1;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exe9 {

    @Test
    public void generalTest1(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'


        //3. Verify that home page is visible successfully
        Driver.getDriver().get("http://automationexercise.com");

        //4. Click on 'Signup / Login' button
        WebElement signUpLoginButton=Driver.getDriver().findElement(By.xpath("//a[@href='/login']"));
        signUpLoginButton.click();
        BrowserUtils.sleep(2);

        //5. Verify 'New User Signup!' is visible
        WebElement newUserSignUpSign=Driver.getDriver().findElement(By.xpath("//h2[.='New User Signup!']"));
        System.out.println("newUserSignUpSign.isDisplayed() = " + newUserSignUpSign.isDisplayed());

        Faker faker=new Faker();
        //6. Enter name and email address
         WebElement name=Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
        WebElement email=Driver.getDriver().findElement(By.xpath("(//input[@type='email'])[2]"));
        name.sendKeys("hasan dogru");
        email.sendKeys(faker.internet().emailAddress());


        //7. Click 'Signup' button
         WebElement signupButton=Driver.getDriver().findElement(By.xpath("(//button[@type='submit'])[2]"));
         signupButton.click();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccInfo=Driver.getDriver().findElement(By.xpath("//b[.='Enter Account Information']"));
        System.out.println("enterAccInfo.isEnabled() = " + enterAccInfo.isEnabled());


        //9. Fill details: Title, Name, Email, Password, Date of birth
        WebElement title=Driver.getDriver().findElement(By.xpath("//input[@name='title']"));
        title.click();

        WebElement nameInfo=Driver.getDriver().findElement(By.xpath("//input[@id='name']"));


        WebElement emailInfo=Driver.getDriver().findElement(By.xpath("//input[@id='email']"));


        WebElement passwordInfo=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passwordInfo.sendKeys(faker.numerify("ab######12A."));



        Select dayOfBirthInfo=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='days']")));
        dayOfBirthInfo.selectByIndex(5);

        Select monthOfBirthInfo=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='months']")));
        monthOfBirthInfo.selectByVisibleText("February");

        Select yearsOfBirthInfo=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='years']")));
        yearsOfBirthInfo.selectByValue("2017");





        //10. Select checkbox 'Sign up for our newsletter!'
        WebElement selectCheckBox=Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));
        selectCheckBox.click();

        //11. Select checkbox 'Receive special offers from our partners!'
        WebElement receiveSpecialOffers=Driver.getDriver().findElement(By.cssSelector("input[name='optin']"));
        receiveSpecialOffers.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName=Driver.getDriver().findElement(By.cssSelector("input[id='first_name']"));
        firstName.sendKeys("hasan");

        WebElement lastName=Driver.getDriver().findElement(By.cssSelector("input[id='last_name']"));
        lastName.sendKeys("dogru");

        WebElement companyName=Driver.getDriver().findElement(By.cssSelector("input[id='company']"));
        companyName.sendKeys("Tesla");

        WebElement adress1=Driver.getDriver().findElement(By.cssSelector("input[id='address1']"));
        adress1.sendKeys(faker.address().streetAddress()+faker.address().buildingNumber()+faker.address().city());

        WebElement adress2=Driver.getDriver().findElement(By.cssSelector("input[id='address2']"));
        adress2.sendKeys(faker.address().cityName());

        Select country=new Select(Driver.getDriver().findElement(By.cssSelector("select[id='country']")));
        country.selectByVisibleText("Australia");

        WebElement state=Driver.getDriver().findElement(By.cssSelector("input[id='state']"));
        state.sendKeys(faker.address().state());

        WebElement city=Driver.getDriver().findElement(By.cssSelector("input[id='city']"));
        city.sendKeys(faker.address().city());

        WebElement zipCode=Driver.getDriver().findElement(By.cssSelector("input[id='zipcode']"));
        zipCode.sendKeys(faker.address().zipCode());

        WebElement mobileNumber=Driver.getDriver().findElement(By.cssSelector("input[id='mobile_number']"));
        mobileNumber.sendKeys(faker.phoneNumber().phoneNumber());

        //13. Click 'Create Account button'
        WebElement createAccount=Driver.getDriver().findElement(By.xpath("(//button[@type='submit'])[1]"));
        createAccount.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement verifyOfAccount=Driver.getDriver().findElement(By.xpath("//b[.='Account Created!']"));
        String actualResult=verifyOfAccount.getText();
        System.out.println("actualResult = " + actualResult);
        String expectedResult="ACCOUNT CREATED!";
        System.out.println("expectedResult = " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult);


        //15. Click 'Continue' button
        WebElement continueButton=Driver.getDriver().findElement(By.xpath("(//a[@href='/'])[3]"));
        continueButton.click();


       // Alert alert=Driver.getDriver().switchTo().alert();
       // alert.accept();

        int size = Driver.getDriver().findElements(By.tagName("iframe")).size();
        System.out.println("size = " + size);

      /*  for(int i=0; i<=size; i++){
            Driver.getDriver().switchTo().frame(i);
            int total=Driver.getDriver().findElements(By.xpath("html/body/a/img")).size();
            System.out.println(total);
            Driver.getDriver().switchTo().defaultContent();
*/
       // WebElement iframe=Driver.getDriver().findElement(By.id("aswift_1"));
        Driver.getDriver().switchTo().frame(5);
        Driver.getDriver().findElement(By.id("aswift_1")).click();
        //Driver.getDriver().switchTo().parentFrame();



        //16. Verify that 'Logged in as username' is visible
       // BrowserUtils.sleep(2);
       //WebElement loggedInVetification=Driver.getDriver().findElement(By.xpath("//ul[@class='nav navbar-nav']//li[10]//a"));
       // System.out.println("loggedInVetification.isEnabled() = " + loggedInVetification.isEnabled());
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

    }
}
