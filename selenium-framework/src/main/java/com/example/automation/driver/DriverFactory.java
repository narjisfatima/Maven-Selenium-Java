package com.example.automation.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
    
    private static WebDriver driver;
    
    public static WebDriver getDriver(){
        if(driver == null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");        // Run without GUI
            options.addArguments("--no-sandbox");          // Disable sandbox for root/containers
            options.addArguments("--disable-dev-shm-usage"); // Avoid /dev/shm crashes
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver(){
        if( driver !=null ){
            driver.quit();
            driver = null;
        }
    }
}
