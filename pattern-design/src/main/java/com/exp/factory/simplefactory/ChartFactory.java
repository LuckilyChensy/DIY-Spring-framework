package com.exp.factory.simplefactory;

public class ChartFactory {

    public static IChart getChart(String type){

        IChart chart = null;

        if(type.equalsIgnoreCase("histogram")){
            chart = new HistogramChart();
        }else if(type.equalsIgnoreCase("pie")){
            chart = new PieChart();
        }else if(type.equalsIgnoreCase("line")){
            chart = new LineChart();
        }

        return chart;

    }
}
