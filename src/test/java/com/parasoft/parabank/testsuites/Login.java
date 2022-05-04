package com.parasoft.parabank.testsuites;

import com.parasoft.parabank.pages.AccountOverviewPage;
import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {

    HomePage homPage=new HomePage();
    AccountOverviewPage accountOverviewPage=new AccountOverviewPage();
    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials() {
        homPage.sendEmailToEmailIdFieldOnHomePage("user958@yahoo.co.uk");
        homPage.sendPasswordOnHomePage("123456");
        homPage.clickOnLoginLink();
        String actualTitle=homPage.validateAccountOverView();
        String expectedTitle="Accounts Overview";
        Assert.assertEquals("Account overview Title Validation",expectedTitle,actualTitle);
    }
    @Test
    public void verifyTheErrorMessage() {
        homPage.sendEmailToEmailIdFieldOnHomePage("12@gmail.com");
        homPage.clickOnLoginLink();
        String actualMessage=homPage.validateErrorMessage();
        String expectedMessage="Login Error message Validation";
        Assert.assertEquals(actualMessage,expectedMessage,"Login Error message Validation");
    }
    @Test
    public void userShouldLogOutSuccessfully() {
        homPage.sendEmailToEmailIdFieldOnHomePage("user958@yahoo.co.uk");
        homPage.sendPasswordOnHomePage("123456");
        homPage.clickOnLoginLink();
        accountOverviewPage.clickOnLogOutBtn();
        homPage.validateCustomerLoginText();
    }
}
