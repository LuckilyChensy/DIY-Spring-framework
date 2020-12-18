package com.exp.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FooProxy implements InvocationHandler {

    Foo target = new FooImpl();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before proxy ... ... ");

        target.testFoo();

        System.out.println("after proxy ... ... ");

        return null;
    }

}
