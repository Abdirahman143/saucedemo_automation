package com.pages;

import com.Base.BaseClass;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.OverviewPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Home_TC extends BaseClass {

    public LoginPage loginPage;
    public HomePage homePage;
    OverviewPage overviewPage;


    @Test(priority = 2)
    public void LoginBtn(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        homePage = loginPage.clickLoginBtn();
    }


    @Test(priority = 3)
    public void verifyFooter(){
       String actual = "© 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
       assertEquals(actual,homePage.verifyFooter());
    }

    @Test(priority = 4)
    public void menuButton(){
        assertTrue(homePage.clickMenuBtn());
    }

    @Test(priority = 5)
    public  void addToCartBackPack(){
        homePage.addToCartBackPack();
    }
   @Test(priority = 6)
    public  void addToCartBikeLight(){
      // assertEquals(true,homePage.addToCartBikeLight());
       homePage.addToCartBikeLight();
    }

    @Test(priority = 7)
    public void addToCarteT_shirt(){
    homePage.addToCartT_shirt();
    }

    @Test(priority = 8)
    public  void finishShopping(){
        overviewPage = new OverviewPage(driver);
        homePage = overviewPage.finishShopping();
    }

}
