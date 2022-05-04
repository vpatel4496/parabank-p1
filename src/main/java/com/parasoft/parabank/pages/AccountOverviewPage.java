package com.parasoft.parabank.pages;

import com.parasoft.parabank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountOverviewPage extends Utility {

    By logOut= By.xpath("//div[@id='leftPanel']/ul/li[8]/a");


    public void clickOnLogOutBtn(){
        clickOnElement(logOut);
    }

}

