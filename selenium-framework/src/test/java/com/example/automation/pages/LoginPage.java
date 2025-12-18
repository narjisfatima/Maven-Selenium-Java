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
        driver.get("https://www.google.com");
    }

    public void enterUsername(String user){
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }
}
