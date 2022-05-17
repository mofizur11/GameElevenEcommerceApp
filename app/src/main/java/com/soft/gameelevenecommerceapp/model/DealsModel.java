package com.soft.gameelevenecommerceapp.model;

public class DealsModel {

     int id;
     int image;
     String shop;

    public DealsModel(int id, int image, String shop) {
        this.id = id;
        this.image = image;
        this.shop = shop;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getShop() {
        return shop;
    }
}
