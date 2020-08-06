package com.dh.Spring5.test;

import com.dh.Spring5.autowire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 17:10
 */
public class AutowireTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireBean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
