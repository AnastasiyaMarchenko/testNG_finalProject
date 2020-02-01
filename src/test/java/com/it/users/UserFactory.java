package com.it.users;

import com.it.lists.List;

import java.util.ResourceBundle;

public class UserFactory {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("user");

    static public User getValidUser (){
        return new User(resourceBundle.getString("username"),
        resourceBundle.getString("password"),
        resourceBundle.getString("email")
        );
    }
}
