package com.dh.Spring5.autowire;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 17:06
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
