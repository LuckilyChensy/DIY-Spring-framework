package com.exp.beans;

public class Order {

    private String orderId;

    private String userId;

    private String itemId;

    private double orderPrice;

    public Order() {
    }

    public Order(String orderId, String userId, String itemId, double orderPrice) {
        this.orderId = orderId;
        this.userId = userId;
        this.itemId = itemId;
        this.orderPrice = orderPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
