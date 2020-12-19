package com.exp.singleton;

import java.util.concurrent.TimeUnit;

public class HungrySigleton {

    private static final HungrySigleton hungrySigleton = new HungrySigleton();

    private HungrySigleton(){}

    public static HungrySigleton getInstance(){
        return hungrySigleton;
    }

    public static void main(String[] args) {
        System.out.println(HungrySigleton.getInstance());

        HungrySigleton target = HungrySigleton.getInstance();

        for (int i = 0; i < 10000000; i++) {
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                HungrySigleton temp = HungrySigleton.getInstance();
                if(temp != target){
                    System.out.println(temp);
                }
            });

        }

    }

}
