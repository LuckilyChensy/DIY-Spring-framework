package com.exp.singleton;

import java.util.concurrent.TimeUnit;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySigleton;

    static{
        hungrySigleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return hungrySigleton;
    }

    public static void main(String[] args) {

        System.out.println(HungryStaticSingleton.getInstance());

        HungryStaticSingleton target = HungryStaticSingleton.getInstance();

        for (int i = 0; i < 10000000; i++) {
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                HungryStaticSingleton temp = HungryStaticSingleton.getInstance();
                if(temp != target){
                    System.out.println(temp);
                }
            });

        }
    }
}
