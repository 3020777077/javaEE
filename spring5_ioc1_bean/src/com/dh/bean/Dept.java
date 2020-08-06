package com.dh.bean;

/**
 * @Description 部门类
 * @Author MrZhou
 * @Date 2020-08-02 21:44
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
