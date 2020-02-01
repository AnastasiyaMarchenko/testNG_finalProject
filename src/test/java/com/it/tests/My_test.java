package com.it.tests;

import com.it.driver.MyDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.*;

public class My_test extends BaseTest{

    @Test
    public void test_01_TestIua() {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getLbUserEmail(),validUser.email);
    }

    @Test
    public void test_02_SendList(){
        app.dashboard.clickDashboardButton(app.dashboard.tabCreateList);
        app.list.sendList(list);
        Assert.assertEquals(app.dashboard.message.getText(),"Письмо успешно отправлено адресатам");
    }

    @Test
    public void test_03_ListsEquals() {
        app.dashboard.clickDashboardButton(app.dashboard.inbox);
        Assert.assertEquals(app.dashboard.sbjName.getText(),list.subject);
    }

    @Test
    public void test_04_ListBodyEquals(){
        app.dashboard.clickDashboardButton(app.dashboard.row);
        Assert.assertTrue(app.list.textBody.getText().contains(list.body));

    }


    //div[@class='block_confirmation']//div[@class='content clear']

}