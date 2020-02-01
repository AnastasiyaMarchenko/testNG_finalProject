package com.it.helpers;

import com.it.pages.LoginPage;
import com.it.users.User;

public class LoginHelper extends LoginPage {


    public void login (User user){
        log.info(String.format("User login username - %s, password - %s .", user.username,user.password));
        login(user.username,user.password);
    }
}
