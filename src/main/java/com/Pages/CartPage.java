package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
private WebElement carte_title;
@FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[2]")
private WebElement carte_desc;
@FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")
private WebElement bakPack_price;

@FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div")
private WebElement bikeLight_price;

@FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[5]/div[2]/div[2]/div")
private  WebElement t_shirt_Price;

@FindBy(id = "checkout")
private WebElement checkout_btn;


    private WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public String verifyCarteTitle() {
        return carte_title.getText();
    }

    public String verifyCarteDescription() {
       return carte_desc.getText();
    }

    public String verifyBackPackPrice() {
        return bakPack_price.getText();
    }

    public String verifyBikeLightPrice() {
        return bikeLight_price.getText();
    }

    public String verifyT_shirtPrice() {
        return t_shirt_Price.getText();
    }

    public CheckoutPage checkout() {
        checkout_btn.click();
        return  new CheckoutPage(driver);
    }
}
