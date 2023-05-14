package com.pages;

import com.Base.BaseClass;
import com.Pages.InformationPage;
import com.Pages.OverviewPage;
import org.testng.annotations.Test;

public class Overview_TC extends BaseClass {
    InformationPage informationPage ;
    OverviewPage overviewPage;

    @Test(priority = 0)
    public void continueToShop(){
        informationPage = new InformationPage(driver);
        overviewPage = new OverviewPage(driver);
        overviewPage = informationPage.continueToShop();
    }
}
