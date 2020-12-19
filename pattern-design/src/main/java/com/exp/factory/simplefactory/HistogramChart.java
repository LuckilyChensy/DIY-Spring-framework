package com.exp.factory.simplefactory;

import com.exp.factory.simplefactory.IChart;

public class HistogramChart implements IChart {

    @Override
    public void display() {
        System.out.println("display HistogramChart");
    }

}
