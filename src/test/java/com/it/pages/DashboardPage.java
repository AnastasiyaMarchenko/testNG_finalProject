package com.it.pages;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//span[@class = 'sn_menu_title']")
    private WebElement lbUserEmail;

    @FindBy(xpath = "//li[@class = 'sn_menu_item ']")
    public WebElement tabCreateList;

    @FindBy(xpath = "//div[@class='block_confirmation']//div[@class='content clear']")
    public WebElement message;

    @FindBy(xpath = "//li[@class='new']")
    public WebElement inbox;

    @FindBy(xpath = "//div[@class='row new'][1]//span[@class='sbj']")
    public WebElement sbjName;

    @FindBy(xpath = "//div[@class='row new'][1]")
    public WebElement row;

    public String getLbUserEmail (){
        BASE_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(lbUserEmail));
        return lbUserEmail.getText();
    }

    public void clickDashboardButton(WebElement webElement){
        webElement.click();
    }


}


//div[@class='section_nav']//a[@contains(href='')]
