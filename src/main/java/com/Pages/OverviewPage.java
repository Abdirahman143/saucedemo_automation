package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
private WebElement page_title;
@FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
private WebElement total_price;
@FindBy(id = "finish")
private WebElement finishBtn;

    private WebDriver driver;

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String verifyPageTitle(){
        return page_title.getText();
    }

    public String getTotalPrice(){
        return total_price.getText();
    }

    public OrderCompletionPage finishShopping(){
        finishBtn.click();
        return new OrderCompletionPage(driver);
    }
}