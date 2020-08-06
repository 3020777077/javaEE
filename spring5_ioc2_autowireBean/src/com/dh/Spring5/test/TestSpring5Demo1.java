package com.dh.Spring5.test;

import com.dh.Spring5.service.Book;
import com.dh.Spring5.service.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-02 22:15
 */
public class TestSpring5Demo1 {
    @Test
    public void TestCollection1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void TestCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book", Book.class);
        System.out.println(book);

        System.out.println(book == book1);//true ，bean是一个单实例对象1
    }
}
