package com.example.automation.tests;


import org.testng.annotations.Test;

import com.example.automation.base.BaseTest;
import com.example.automation.pages.LoginPage;

public class LoginTest extends BaseTest {
    
    @Test
    public void validLoginTest(){
        LoginPage login = new LoginPage(driver);
        login.openLoginPage();
        // login.enterUsername("user name");
        // login.enterPassword("Password");
        // login.clickLogin();

    }
}
