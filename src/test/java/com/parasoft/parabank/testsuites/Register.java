package com.parasoft.parabank.testsuites;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.SignUpPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Register extends TestBase {

    HomePage homPage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homPage.clickOnRegisterLink();
        String actualText = signUpPage.VerifySignUpText();
        String expectedText = "Signing up is easy!";
        Assert.assertEquals(actualText, expectedText, "Verify SignUp Text");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        homPage.clickOnRegisterLink();
        signUpPage.enterFirstName("leet");
        signUpPage.enterLastname("lor");
        signUpPage.enterAddress("123 angel street");
        signUpPage.enterCityName("london");
        signUpPage.enterStateName("ohio");
        signUpPage.enterZipCode("345737");
        signUpPage.enterPhoneNumber("98989467498");
        signUpPage.enterSnnNumber("126874");
        signUpPage.sendEmailToEmailIdField();
        signUpPage.enterPassword("123456");
        signUpPage.enterConfirmedPassword("123456");
        signUpPage.clickOnRegisterButton();
        String actualText=signUpPage.verifyAccountCreatedSuccessfully();
        String expectedText="Your account was created successfully. You are now logged in.";
        Assert.assertEquals(actualText,expectedText,"account successfully created text");
    }
}
