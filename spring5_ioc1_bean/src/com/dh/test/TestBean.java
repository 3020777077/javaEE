package com.dh.test;

import com.dh.bean.Emp;
import com.dh.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-02 19:43
 */
public class TestBean {
    @Test
    public void testBean1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void testBean3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

}