package com.example.seapp;

public class InventoryRowModel {
    String date = "";
    String name = "";
    String product = "";
    String quantity = "";

    public InventoryRowModel(String date, String name, String product, String quantity) {
        this.date = date;
        this.name = name;
        this.product = product;
        this.quantity = quantity;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public String getQuantity() {
        return quantity;
    }
}
