package com.pages;

import com.Base.BaseClass;
import com.Pages.OrderCompletionPage;
import com.Pages.OverviewPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class OrderCompletion_TC extends BaseClass {

    OrderCompletionPage completionPage;
    OverviewPage overviewPage;

    @Test()
    public  void finishShopping(){
        overviewPage = new OverviewPage(driver);
        completionPage = new OrderCompletionPage(driver);
        completionPage = overviewPage.finishShopping();
    }

    @Test(priority = 1)
    public void verifyPageTitle(){
        String expected ="Checkout: Complete!";
       String actual= completionPage.verifyPageTitle();
       assertEquals(expected, actual);
    }
    @Test(priority = 2)
    public void verifyOrderMessage(){
        String expected = "Thank you for your order!";
        String actual = completionPage.verifyOrderMessage();
        assertEquals(expected,actual);
    }
}
