package com.soft.gameelevenecommerceapp.model;

public class BrandModel {

    private int id;
    private int image;
    private int cImage;


    public BrandModel(int id, int image, int cImage) {
        this.id = id;
        this.image = image;
        this.cImage = cImage;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public int getcImage() {
        return cImage;
    }
}
