package com.exp.prototype.simple;

public class ConcretePrototypeA implements Prototype {

    private String name;
    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return 只拷贝了内容
     */
    @Override
    public ConcretePrototypeA clone() {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setName(this.name);
        concretePrototype.setAddress(this.address);
        return concretePrototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
