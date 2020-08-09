package com.dh.Spring5.test;

import com.dh.Spring5.config.TxCofig;
import com.dh.Spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void accountMoney() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbcTemplate.xml");
        UserService service = context.getBean("userService", UserService.class);
        service.accountMoney();
    }

    //使用XML方式进行声明式事务管理
    @Test
    public void accountMoney2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbcTemplate2.xml");
        UserService service = context.getBean("userService", UserService.class);
        service.accountMoney();
    }


    //使用完全注解方式进行声明式事务管理：完全注解开启事务和Xml方式冲突
    @Test
    public void accountMoney3() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxCofig.class);
        UserService service = context.getBean("userService", UserService.class);
        service.accountMoney();
    }


}