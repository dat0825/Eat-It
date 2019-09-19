package com.example.eatit.Model;

public class Order {

    public Order() {
    }

    public Order(String productId, String productName, String quantity, String price, String discount) {
        this.ProductId = productId;
        this.ProductName = productName;
        this.Quantity = quantity;
        this.Price = price;
        this.Discount = discount;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        this.ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        this.Quantity = quantity;
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

    private String ProductId;
    private String ProductName;
    private String Quantity;
    private String Price;
    private String Discount;
}
