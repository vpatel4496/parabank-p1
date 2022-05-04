package com.parasoft.parabank.pages;

import com.parasoft.parabank.utilities.Utility;
import org.openqa.selenium.By;

import java.util.Random;

public class SignUpPage extends Utility {

    By signUpText=By.xpath("//div[@id='rightPanel']/h1");
    By firstName=By.id("customer.firstName");
    By lastName=By.id("customer.lastName");
    By address=By.id("customer.address.street");
    By city=By.id("customer.address.city");
    By state=By.id("customer.address.state");
    By zipCode=By.id("customer.address.zipCode");
    By phoneNumber=By.id("customer.phoneNumber");
    By ssn=By.id("customer.ssn");
    By emailField=By.id("customer.username");
    By password=By.id("customer.password");
    By confirmedPass=By.id("repeatedPassword");
    By registerBtn=By.xpath("//input[@value='Register']");
    By title=By.xpath("//div[@id='rightPanel']/p");

    public String VerifySignUpText(){
        return getTextFromElement(signUpText);
    }
    public void enterFirstName(String fName){
        sendTextToElement(firstName,fName);
    }
    public void enterLastname(String lName){sendTextToElement(lastName,lName);}
    public void enterAddress(String add){
        sendTextToElement(address,add);
    }
    public void  enterCityName(String cityName){
        sendTextToElement(city,cityName);
    }
    public void enterStateName(String stateName){
        sendTextToElement(state,stateName);
    }
    public void enterZipCode(String zipNumber){
        sendTextToElement(zipCode,zipNumber);
    }
    public void enterPhoneNumber(String number){
        sendTextToElement(phoneNumber,number);
    }
    public void enterSnnNumber(String num1){
        sendTextToElement(ssn,num1);
    }
    public void sendEmailToEmailIdField(){
        Random randomGenerator = new Random();// random generator class
        int randomInt = randomGenerator.nextInt(2000);
        sendTextToElement(emailField,"user" + randomInt + "@yahoo.co.uk");
        System.out.println("user" + randomInt + "@yahoo.co.uk");
    }
    public void enterPassword(String pass){
        sendTextToElement(password,pass);
    }
    public void enterConfirmedPassword(String pass1){
        sendTextToElement(confirmedPass,pass1);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerBtn);
    }
    public String verifyAccountCreatedSuccessfully(){
        return getTextFromElement(title);
    }
}
