package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListPage extends BasePage{

    @FindBy(name = "to")
    private WebElement inputAddress;

    @FindBy(name = "subject")
    private WebElement inputSubject;

    @FindBy(xpath = "//div[@class='text_editor_browser']//textarea[@name='body']")
    private WebElement inputBodyText;

    @FindBy(xpath = "//p[@class='send_container']//input[@name='send']")
    private WebElement btnSendList;

    @FindBy(xpath = "//div[@class='message_body']")
    public WebElement textBody;


    protected void sendList (String to, String subject,String body) {
        inputAddress.sendKeys(to);
        inputSubject.sendKeys(subject);
        inputBodyText.sendKeys(body);
        btnSendList.click();
    }
}
