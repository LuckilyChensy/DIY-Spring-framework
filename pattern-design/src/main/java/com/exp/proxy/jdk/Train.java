package com.exp.proxy.jdk;

public class Train implements Traffic {

    private String speed = "450km/h";

    @Override
    public void transport() {
        System.out.println(" from shanghai to beijing by speed: "+this.speed);
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
