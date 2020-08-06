package com.dh.Spring5.test;

import com.dh.Spring5.service.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 16:20
 */
public class MyBeanTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("mybean.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
}
