package com.dh.spring5;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-02 21:05
 */
public class Order {
    //属性：
    private String oname;
    private String address;
    //有参构造器

    public Order(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oname='" + oname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
