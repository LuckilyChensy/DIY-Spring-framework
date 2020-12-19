package com.exp.singleton;

import java.util.concurrent.TimeUnit;

public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazy = null;

    public static synchronized LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

    public static void main(String[] args) {

        System.out.println(LazySimpleSingleton.getInstance());

        LazySimpleSingleton target = LazySimpleSingleton.getInstance();

        for (int i = 0; i < 10000000; i++) {
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LazySimpleSingleton temp = LazySimpleSingleton.getInstance();
                if(temp != target){
                    System.out.println(temp);
                }
            });

        }
    }
}
