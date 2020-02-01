package com.it.helpers;

import com.it.lists.List;
import com.it.pages.DashboardPage;
import com.it.pages.ListPage;
import com.it.pages.LoginPage;
import com.it.users.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListHelper extends ListPage {

    public void sendList(List list) {
        sendList(list.to, list.body, list.subject);
    }
}
