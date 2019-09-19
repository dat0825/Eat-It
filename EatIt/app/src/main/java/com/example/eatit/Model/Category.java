package com.example.eatit.Model;

public class Category {
    public Category(String name, String image) {
        this.Name = name;
        this.Image = image;
    }

    public Category() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        this.Image = image;
    }

    private String Name;
    private String Image;
}
