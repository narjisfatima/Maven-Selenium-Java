package com.example.automation.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.example.automation.driver.DriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = DriverFactory.getDriver();
    }

    @AfterTest
    public void teardown(){
        DriverFactory.quitDriver();
    }
    
}