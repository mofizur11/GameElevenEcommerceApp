package com.soft.gameelevenecommerceapp.model;

public class OrderModel {

    int id;
    String orderId;
    String modelId;
    String devel;
    String date;

    public OrderModel(int id, String orderId, String modelId, String devel, String date) {
        this.id = id;
        this.orderId = orderId;
        this.modelId = modelId;
        this.devel = devel;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getModelId() {
        return modelId;
    }

    public String getDevel() {
        return devel;
    }

    public String getDate() {
        return date;
    }
}
