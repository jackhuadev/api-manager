package com.lettin.apimanager.entity;

/**
 * @ClassName User
 * @Description TODO
 * @Author zhanghuapei
 * @Date 2018/10/9 0009 15:13
 * @Version 1.0
 **/
public class User {
    private String loginName;
    private String password;
    private String name;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
