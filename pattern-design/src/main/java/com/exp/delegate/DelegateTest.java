package com.exp.delegate;

public class DelegateTest {

    public static void main(String[] args) {

        new CEO().command("NO01",new ProjectManager());

    }
}
