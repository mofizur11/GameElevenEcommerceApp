package com.soft.gameelevenecommerceapp.model;

import android.graphics.drawable.Drawable;

public class WishListModel {

    public int productImage;
    public String productName;
    public String productPrice;

    public WishListModel(int productImage, String productName, String productPrice) {
        this.productImage = productImage;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }
}
