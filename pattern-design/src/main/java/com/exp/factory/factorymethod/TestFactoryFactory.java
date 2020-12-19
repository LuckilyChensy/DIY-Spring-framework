package com.exp.factory.factorymethod;

import com.exp.factory.IChart;

public class TestFactoryFactory {

    public static void main(String[] args) {

        IChartFactory factory = new PieChartFactory();
        IChart pieChart = factory.create();
        pieChart.display();

        factory = new LineChartFactory();
        IChart lineChart = factory.create();
        lineChart.display();

    }
}
