package com.dh.Spring5.service;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-02 22:25
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
