package com.exp.factory.simplefactory;

import com.exp.factory.HistogramChart;
import com.exp.factory.LineChart;
import com.exp.factory.PieChart;
import com.exp.tools.XMLUtil;
import org.junit.jupiter.api.Test;

public class TestSimpleFactory {
    /**
     * if else 方式
     * 新增一个类需要修改两处
     */
    @Test
    public void testMethod01() throws Exception {

//        new ChartFactory().getChart("histogram").display();
//        new ChartFactory().getChart("pie").display();
//        new ChartFactory().getChart("line").display();

//        new ChartFactory().getChart("com.exp.factory.HistogramChart").display();
//        new ChartFactory().getChart("com.exp.factory.PieChart").display();
//        new ChartFactory().getChart("com.exp.factory.LineChart").display();

        new ChartFactory().getChart(HistogramChart.class).display();
        new ChartFactory().getChart(PieChart.class).display();
        new ChartFactory().getChart(LineChart.class).display();

    }

    @Test
    public void testMethod02() throws Exception {
        String type = XMLUtil.getChartType();
//        ChartFactory.getChart(type).display();
    }

}
