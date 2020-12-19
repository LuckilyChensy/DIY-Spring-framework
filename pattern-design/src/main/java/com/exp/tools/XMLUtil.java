package com.exp.tools;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.IOException;
import java.io.InputStream;

public class XMLUtil {

    public static String getChartType() throws Exception {

        InputStream inputStream =null;

        String text = "";

        try {

            SAXReader reader=new SAXReader();
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.xml");
            Document document = reader.read(inputStream);
            Element rootElement = document.getRootElement();
            Element element = rootElement.element("chartType");
            text = element.getText();

        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return text;

    }
}
