package com.exp.factory.abstractFactory;

import com.exp.factory.IChart;
import com.exp.factory.IText;
import com.exp.factory.LineChart;
import com.exp.factory.LineText;

public class  EmailFactory implements Factory{
    @Override
    public IChart createChart() {
        return new LineChart();
    }

    @Override
    public IText createText() {
        return new LineText();
    }
}
