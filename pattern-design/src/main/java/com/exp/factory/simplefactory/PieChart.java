package com.exp.factory.simplefactory;

import com.exp.factory.simplefactory.IChart;

public class PieChart implements IChart {

    @Override
    public void display() {
        System.out.println("display PieChart");
    }

}
