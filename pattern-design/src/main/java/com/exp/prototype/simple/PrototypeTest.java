package com.exp.prototype.simple;

public class PrototypeTest {

    public static void main(String[] args) {

        // 创建一个具体的需要克隆的对象
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        // 填充属性，方便测试
        concretePrototype.setName("JAVA");
        concretePrototype.setAddress("prototype");

        System.out.println(concretePrototype);

        // 创建Client对象，准备开始克隆
        Client client = new Client(concretePrototype);
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);

        System.out.println("克隆对象中的引用类型地址值：" + concretePrototypeClone);
        System.out.println("原对象中的引用类型地址值：" + concretePrototype);
        System.out.println("对象地址比较："+(concretePrototypeClone == concretePrototype));
    }
}
