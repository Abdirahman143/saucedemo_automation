package com.pages;

import com.Base.BaseClass;
import com.Pages.CartPage;
import com.Pages.CheckoutPage;
import com.Pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Checkout_TC extends BaseClass {
    CartPage cartPage;
    CheckoutPage checkoutPage;


    @Test(priority = 1)
    public void checkout() {
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        checkoutPage = cartPage.checkout();
    }



}