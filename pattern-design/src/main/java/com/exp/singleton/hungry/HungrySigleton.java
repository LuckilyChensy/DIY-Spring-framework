package com.exp.singleton.hungry;

public class HungrySigleton {

    // 在类加载的时候初始化,但是会占用方法区空间
    private static final HungrySigleton hungrySigleton = new HungrySigleton();

    private HungrySigleton(){}

    public static HungrySigleton getInstance(){
        return hungrySigleton;
    }

}
