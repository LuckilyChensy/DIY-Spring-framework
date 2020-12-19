package com.exp.decorator.battercake;

public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getMsg(){
        return super.getMsg() + " 1 个鸡蛋 ";
    }

    @Override
    public int getPrice(){
        return super.getPrice()+1;
    }
}
