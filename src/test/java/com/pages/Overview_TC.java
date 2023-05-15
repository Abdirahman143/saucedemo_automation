package com.pages;

import com.Base.BaseClass;
import com.Pages.InformationPage;
import com.Pages.OverviewPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Overview_TC extends BaseClass {
    InformationPage informationPage ;
    OverviewPage overviewPage;

    @Test(priority = 0)
    public void continueToShop(){
        informationPage = new InformationPage(driver);
        overviewPage = new OverviewPage(driver);
        overviewPage = informationPage.continueToShop();
    }


    @Test(priority = 1)
    public void getPageTitle(){
        String expected ="Checkout: Overview";
        String actual = overviewPage.verifyPageTitle();
        assertEquals(expected,actual);
    }

    @Test(priority = 2)
    public void getTotalPrice(){
        String total = "Total: $60.45";
        String expected = total.substring(7);
       String actual = overviewPage.getTotalPrice().substring(7);
       assertEquals(expected,actual);

    }
}
