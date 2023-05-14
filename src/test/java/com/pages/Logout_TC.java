package com.pages;

import com.Base.BaseClass;
import com.Pages.HomePage;
import com.Pages.Logout;
import org.testng.annotations.Test;

public class Logout_TC extends BaseClass {
    Logout logout;
    HomePage homePage;

    @Test(priority = 1)
    public void clickLogoutBtn(){
        logout = new Logout(driver);
        homePage = new HomePage(driver);
        logout = homePage.clickLogoutBtn();
    }
}
