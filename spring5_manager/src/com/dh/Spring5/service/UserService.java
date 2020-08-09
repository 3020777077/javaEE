package com.dh.Spring5.service;

import com.dh.Spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 事务：@Transactional可以添加到类上， 为类中的所有方法都添加事务，
 * 也可以只添加方法中，只为某个方法添加事务
 * @Author MrZhou
 * @Date 2020-08-04 17:01
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    //转账
    public void accountMoney() {
//        try {
        //开启事务

        //lucy少100
        userDao.reduceMoney();

        //模拟异常
        int i = 10 / 0;

        //mary多100
        userDao.addMoney();

        //提交事务
//        } catch (Exception e) {
//            e.printStackTrace();
        //事务回滚
//        }
    }
}
