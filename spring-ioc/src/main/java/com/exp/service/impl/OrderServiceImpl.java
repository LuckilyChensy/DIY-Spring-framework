package com.exp.service.impl;

import com.exp.beans.Order;
import com.exp.dao.OrderDao;
import com.exp.dao.impl.OrderDaoImpl;
import com.exp.service.OrderService;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    OrderDao orderDao = new OrderDaoImpl();

    @Override
    public List<Order> listOrders() {
        return orderDao.listOrders();
    }

}
