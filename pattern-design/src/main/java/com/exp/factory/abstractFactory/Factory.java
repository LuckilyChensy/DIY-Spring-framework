package com.exp.factory.abstractFactory;

import com.exp.factory.IChart;
import com.exp.factory.IText;

public interface Factory {

    IChart createChart();

    IText createText();
}
