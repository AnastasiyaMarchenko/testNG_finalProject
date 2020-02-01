package com.it.lists;

import com.it.users.User;

import java.util.ResourceBundle;

public class ListFactory {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("list");

    static public List getList (){
        return new List(resourceBundle.getString("to"),
                resourceBundle.getString("subject"),
                resourceBundle.getString("body")
        );
    }
}
