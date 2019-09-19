package com.example.eatit.Model;

import java.util.List;

public class Request {

    public Request() {
    }

    public Request(String phone, String name, String address, String total, List<Order> foods) {
        this.Phone = phone;
        this.Name = name;
        this.Address = address;
        this.Total = total;
        this.Foods = foods;
        this.Status = "0"; // default = 0 ; 0: placed, 1: shipping, 2:shipped
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        this.Total = total;
    }

    public List<Order> getFoods() {
        return Foods;
    }

    public void setFoods(List<Order> foods) {
        this.Foods = foods;
    }

    private String Phone;
    private String Name;
    private String Address;
    private String Total;
    private List<Order> Foods;
    private String Status;
}
