package com.exp.factory.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        BookFactory factory = new BookFactory();
        factory.createChart().display();
        factory.createText().readText();
    }
}
