package com.exp.factory;

import com.exp.factory.simplefactory.ChartFactory;
import com.exp.factory.simplefactory.IChart;
import com.exp.tools.XMLUtil;
import org.junit.jupiter.api.Test;

public class TestClient {
    /**
     * if else 方式
     * 新增一个类需要修改两处
     */
    @Test
    public void testMethod01(){

        new ChartFactory().getChart("histogram").display();
        new ChartFactory().getChart("pie").display();
        new ChartFactory().getChart("line").display();

    }

    @Test
    public void testMethod02() throws Exception {
        String type = XMLUtil.getChartType();
        ChartFactory.getChart(type).display();
    }

}