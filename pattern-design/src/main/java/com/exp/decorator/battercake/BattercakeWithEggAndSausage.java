package com.exp.decorator.battercake;

public class BattercakeWithEggAndSausage extends BattercakeWithEgg {

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1 根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }

}
