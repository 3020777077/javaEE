package com.dh.spring5;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-02 19:40
 */
public class User {

    private String username;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public void add() {
        System.out.println("add....");
    }
}
