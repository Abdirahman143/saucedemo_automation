package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCompletionPage {
@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
private WebElement pageTitle;

@FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
private WebElement orderMessage;

@FindBy(id = "back-to-products")
private WebElement backToHomeBtn;

    private WebDriver driver;

    public  OrderCompletionPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    public String verifyPageTitle(){
        return pageTitle.getText();
    }


    public String verifyOrderMessage(){
        return orderMessage.getText();
    }

    public HomePage clickBackToHomePageBtn(){
        backToHomeBtn.click();
        return  new HomePage(driver);
    }
}
