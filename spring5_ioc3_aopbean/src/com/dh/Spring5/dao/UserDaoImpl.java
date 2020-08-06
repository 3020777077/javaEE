package com.dh.Spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 18:31
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add...");
    }
}
