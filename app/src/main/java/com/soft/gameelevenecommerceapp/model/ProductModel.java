package com.soft.gameelevenecommerceapp.model;

public class ProductModel {

    private int id;
    private int image;
    private String title;
    private String price;

    public ProductModel(int id, int image, String title, String price) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }
}
