package com.pages;

import com.Base.BaseClass;
import com.Pages.LoginPage;
import org.junit.runner.RunWith;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Login_TC extends BaseClass {

LoginPage loginPage;

@BeforeSuite
    public void startBrowser(){
        browser();
        setUp();
        loginPage = new LoginPage(driver);
    }


   @Test
    public void isLogoDisplayed(){
        boolean flag = loginPage.islogoDisplayed();
        Assert.assertEquals(flag, true);

    }

    @Test(priority = 1)
    public void userNameAndPassword(){
        String username = prop.getProperty("username");
        String password =prop.getProperty("password");
        if(username!=null && password!=null){
            loginPage.enterCredential(prop.getProperty("username"), prop.getProperty("password"));
            assertTrue(true);
        }else
        {
            assertEquals(username,null);
            assertEquals(password, null);
        }

    }



}
