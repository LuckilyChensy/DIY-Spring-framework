package com.exp.dao.impl;

import com.exp.beans.Order;
import com.exp.dao.OrderDao;

import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    @Override
    public List<Order> listOrders() {

        List<Order> temp = new ArrayList<Order>();

        temp.add(new Order("order01","user01","item01",1));
        temp.add(new Order("order02","user02","item02",2));
        temp.add(new Order("order03","user03","item03",3));

        return temp;
    }

}
