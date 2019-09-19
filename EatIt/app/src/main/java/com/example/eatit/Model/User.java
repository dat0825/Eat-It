package com.example.eatit.Model;

public class User {

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        IsStaff = "false";
    }

    public User(String name, String password, String phone) {
        this.name = name;
        this.password = password;
        Phone = phone;
        IsStaff = "false";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getIsStaff() {
        return IsStaff;
    }

    public void setIsStaff(String isStaff) {
        IsStaff = isStaff;
    }

    private String name;
    private String password;
    private String Phone;
    private String IsStaff;
}
