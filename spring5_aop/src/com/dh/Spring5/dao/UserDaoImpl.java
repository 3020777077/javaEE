package com.dh.Spring5.dao;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 21:36
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了...");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了...");
        return id;
    }
}
