package com.example.eatit.Model;

public class Food {

    public Food() {
    }

    public Food(String name, String image, String description, String price, String discount, String menuId) {
        this.Name = name;
        this.Image = image;
        this.Description = description;
        this.Price = price;
        this.Discount = discount;
        this.MenuId = menuId;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        this.Discount = discount;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        this.MenuId = menuId;
    }

    private String Name, Image, Description, Price, Discount, MenuId;
}
