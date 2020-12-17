package com.exp.controller;

import com.exp.service.OrderService;
import com.exp.service.impl.OrderServiceImpl;

/**
 * 接收客户端请求，并调用相应服务
 */
public class OrderController {

    OrderService orderService = new OrderServiceImpl();

    public void listOrderInfo(){

        System.out.println(orderService.listOrders());

    }
}
