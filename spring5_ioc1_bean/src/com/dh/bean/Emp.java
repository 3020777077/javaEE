package com.dh.bean;

/**
 * @Description 员工类
 * @Author MrZhou
 * @Date 2020-08-02 21:45
 */
public class Emp {

    private String ename;
    private String gender;

    //员工属于某一个部门,使用对象形式表示
    private Dept dept;

    public Dept getDept() {

        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
