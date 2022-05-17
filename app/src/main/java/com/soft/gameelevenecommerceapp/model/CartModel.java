package com.soft.gameelevenecommerceapp.model;

public class CartModel {

    public int cartImage;
    public String cartTitle;
    public String cartModel;
    public String cartPrice;

    public CartModel(int cartImage, String cartTitle, String cartModel, String cartPrice) {
        this.cartImage = cartImage;
        this.cartTitle = cartTitle;
        this.cartModel = cartModel;
        this.cartPrice = cartPrice;
    }

    public int getCartImage() {
        return cartImage;
    }

    public String getCartTitle() {
        return cartTitle;
    }

    public String getCartModel() {
        return cartModel;
    }

    public String getCartPrice() {
        return cartPrice;
    }
}
