package com.it.pages;

import com.it.driver.DriverFactory;
import com.it.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {



    static protected MyDriver driver = MyDriver.getMyDriver();

    protected Logger log = Logger.getLogger(this.getClass().getName());

    protected WebDriverWait BASE_DRIVER_WAIT = new WebDriverWait(driver, 10);

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
