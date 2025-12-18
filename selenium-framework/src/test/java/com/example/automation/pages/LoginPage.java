package com.example.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By username = By.id("id");
    private By password = By.id("id");
    private By loginBtn = By.id("id");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void openLoginPage(){
        driver.get("url");
    }

    public void enterUsername(){
        driver.findElement(username).sendKeys("User name");
    }

    public void enterPassword(){
        driver.findElement(password).sendKeys("password");
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }
}
