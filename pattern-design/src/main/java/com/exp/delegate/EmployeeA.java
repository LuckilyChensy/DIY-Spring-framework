package com.exp.delegate;

public class EmployeeA implements Employee {

    @Override
    public void doing(String command) {
        System.out.println("Employee A do: " + command + " !!!");
    }
}
