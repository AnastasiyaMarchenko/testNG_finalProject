package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashboardHelper;
import com.it.helpers.ListHelper;
import com.it.helpers.LoginHelper;

public class App {

    public CommonHelper common;
    public DashboardHelper dashboard;
    public LoginHelper login;
    public ListHelper list;

    public App(){
        common = new CommonHelper();
        dashboard = new DashboardHelper();
        login = new LoginHelper();
        list = new ListHelper();
    }
}
