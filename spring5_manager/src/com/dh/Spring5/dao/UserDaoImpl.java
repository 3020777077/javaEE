package com.dh.Spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-04 17:01
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /*
    lucy转账mary100
     */
    @Override
    public void addMoney() {
        String sql = "update t_account set money = money - ? where username = ?";
        jdbcTemplate.update(sql, 100, "lucy");
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money + ? where username = ?";
        jdbcTemplate.update(sql, 100, "mary");
    }
}
