package com.soft.gameelevenecommerceapp.model;

public class HotCategoryModel {

    private int id;
    private int image;
    private String model;

    public HotCategoryModel(int id, int image, String model) {
        this.id = id;
        this.image = image;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getPrice() {
        return model;
    }

}
