package com.pages;

import com.Base.BaseClass;
import com.Pages.CartPage;
import com.Pages.HomePage;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class Cart_TC  extends BaseClass {
    HomePage homePage;
    CartPage cartPage;

    @Test(priority = 1)
    public void addToCart(){
        cartPage = new CartPage(driver);
        homePage =new HomePage(driver);
        cartPage = homePage.addToCart();
    }

    @Test(priority = 2)
    public void verifyCarteTitle(){
        String expected = "Your Cart";
        String actual = cartPage.verifyCarteTitle();
        assertEquals(expected,actual);
    }


    @Test(priority = 3)
    public void verifyCarteDescription(){
        String expected = "Description";
        String actual = cartPage.verifyCarteDescription();
        assertEquals(expected,actual);
    }
    @Test(priority = 4)
    public void verifyBackPackPrice(){
        String expected = "$29.99";
        String actual = cartPage.verifyBackPackPrice();
        assertEquals(expected,actual);
    }
    @Test(priority = 5)
    public void verifyBikeLightPrice(){
        String expected = "$9.99";
        String actual = cartPage.verifyBikeLightPrice();
        assertEquals(expected,actual);
    }

    @Test(priority = 5)
    public void verifyT_shirtPrice(){
        String expected = "$15.99";
        String actual = cartPage.verifyT_shirtPrice();
        assertEquals(expected,actual);
    }
}
