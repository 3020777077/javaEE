package com.dh.Spring5.bean;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 16:41
 */
public class Orders {
    private String oname;

    public Orders() {
        System.out.println("第一步：执行无参构造器创建bean实例");
    }

    public void setOname(String oname) {
        System.out.println("第二步：调用set方法设置属性值");
        this.oname = oname;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                '}';
    }

    public void initMethod() {
        System.out.println("第三步：初始化方法");
    }
    public void destroyMethod() {
        System.out.println("第五步：销毁的方法");
    }

}
