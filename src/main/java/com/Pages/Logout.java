package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Logout {

    private WebDriver driver;

    public Logout(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


}
