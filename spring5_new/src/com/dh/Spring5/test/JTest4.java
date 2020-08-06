package com.dh.Spring5.test;

import com.dh.Spring5.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description Spring5:整合JUtil4测试框架
 * @Author MrZhou
 * @Date 2020-08-04 22:40
 */
@RunWith(SpringJUnit4ClassRunner.class) //单元测试框架
@ContextConfiguration("classpath:beanJdbcTemplate.xml") //加载配置文件
public class JTest4 {
    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }
}
