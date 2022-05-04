package com.parasoft.parabank.pages;

import com.parasoft.parabank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By registerLink=By.xpath("//div[@id='loginPanel']/p[2]/a");
    By usernameField=By.xpath("//div[@id='loginPanel']/form/div[1]/input");
    By passwordField=By.xpath("//div[@id='loginPanel']/form/div[2]/input");
    By loginLink=By.xpath("//div[@id='loginPanel']/form/div[3]/input");
    By title=By.xpath("//div[@id='rightPanel']/div/div/h1");
    By error=By.xpath("//div[@id='rightPanel']/p");
    By title1=By.xpath("//div[@id='leftPanel']/h2");

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void sendEmailToEmailIdFieldOnHomePage(String username){
        sendTextToElement(usernameField,username);
    }
    public void sendPasswordOnHomePage(String pass){
        sendTextToElement(passwordField,pass);
    }
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public String validateAccountOverView(){
        return getTextFromElement(title);
    }
    public String validateErrorMessage(){
        return getTextFromElement(error);
    }
    public String validateCustomerLoginText(){
        return getTextFromElement(title1);
    }

}
