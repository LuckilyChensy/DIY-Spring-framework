package com.exp.delegate;

public class EmployeeB implements Employee {

    @Override
    public void doing(String command) {

        System.out.println("Employee B do: " + command + " !!!");
    }
}
