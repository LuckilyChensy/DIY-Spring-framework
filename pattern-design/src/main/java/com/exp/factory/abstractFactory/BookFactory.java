package com.exp.factory.abstractFactory;

import com.exp.factory.IChart;
import com.exp.factory.IText;
import com.exp.factory.PieChart;
import com.exp.factory.PieText;

public class BookFactory implements Factory {

    @Override
    public IChart createChart() {
        return new PieChart();
    }

    @Override
    public IText createText() {
        return new PieText();
    }
}
