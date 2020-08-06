package com.dh.service;

import com.dh.dao.UserDao;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-02 21:31
 */
public class UserService {

    //创建UserDao 类型的属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add ....");

        userDao.update();

        //原始方法：创建UserDao对象
//        UserDao dao = new UserDaoImpl();
//        dao.update();

        //用spring
    }
}
