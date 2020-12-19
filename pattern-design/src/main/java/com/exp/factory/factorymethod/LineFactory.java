package com.exp.factory.factorymethod;

import com.exp.factory.IChart;
import com.exp.factory.LineChart;

public class LineFactory implements IChartFactory {
    @Override
    public IChart create() {
        return new LineChart();
    }
}
