package com.exp;

import com.exp.controller.OrderController;

public class OrderApplication {

    public static void main(String[] args) {
        OrderController oc = new OrderController();
        oc.listOrderInfo();
    }

}
