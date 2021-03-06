package com.it.pages;

import com.it.tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(name = "login")
	private WebElement inputLogin;

    @FindBy(name = "pass")
    private WebElement inputPassword;

	@FindBy(xpath = "//input[@tabindex='5']")
	private WebElement btnLogin;

	protected void login (String username, String password) {
/*		driver.scrollDown();
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		driver.scrollUp();*/
	    inputLogin.sendKeys(username);
	    inputPassword.sendKeys(password);
	    btnLogin.click();
    }
}
