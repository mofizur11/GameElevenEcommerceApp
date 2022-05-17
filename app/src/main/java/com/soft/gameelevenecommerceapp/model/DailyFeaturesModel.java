package com.soft.gameelevenecommerceapp.model;

public class DailyFeaturesModel {

    private int id;
    private int image;
    private String price;

    public DailyFeaturesModel(int id, int image, String price) {
        this.id = id;
        this.image = image;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }
}


