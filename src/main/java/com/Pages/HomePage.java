package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"page_wrapper\"]/footer/div")
    private WebElement footer;
    @FindBy(id = "react-burger-menu-btn")
     private WebElement menu_btn;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logout_btn;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement backpack;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement bike_light;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement t_shirt;
    @FindBy(id = "shopping_cart_container")
    private  WebElement shoppingCart_btn;


    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String verifyFooter(){
         return  footer.getText();
    }


    public boolean clickMenuBtn(){
        menu_btn.click();
        return menu_btn.isEnabled();
    }

    public Logout clickLogoutBtn(){
        logout_btn.click();
        return new Logout(driver);
    }

    public  void addToCartBackPack(){
        backpack.click();
    }
    public void addToCartBikeLight(){
        bike_light.click();
    }

    public void addToCartT_shirt(){
        t_shirt.click();

    }

public CartPage addToCart(){
        shoppingCart_btn.click();
        return  new CartPage(driver);
}


}
