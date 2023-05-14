package com.pages;

import com.Base.BaseClass;
import com.Pages.InformationPage;
import org.testng.annotations.Test;

public class Information_TC extends BaseClass {
    InformationPage informationPage;

    @Test(priority = 0)
    public void getPageTitle(){
        informationPage = new InformationPage(driver);
        informationPage.getTitle();
    }
    @Test(priority = 1)
    public void enterFirstName(){
        informationPage.enterFirstName("Abdi");
    }
    @Test(priority = 2)
    public void enterLastName(){
        informationPage.enterLastName("Omar");
    }

    @Test(priority = 3)
    public void enterPostalCode(){
        informationPage.enterPostalCode("00123");
    }


}
