package com.Pages;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[1]")
    private WebElement logo;
    @FindBy(id = "user-name")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public LoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean islogoDisplayed(){
        return logo.isDisplayed();
    }

    public void enterCredential(String user_name,String password_value){
        userName.click();
        userName.clear();
        userName.sendKeys(user_name);

        password.click();
        password.clear();
        password.sendKeys(password_value);
    }

    public HomePage clickLoginBtn(){
        loginBtn.click();
        return  new HomePage(driver);
    }
}
