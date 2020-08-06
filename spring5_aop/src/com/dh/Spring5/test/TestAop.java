package com.dh.Spring5.test;

import com.dh.Spring5.aopanno.User;
import com.dh.Spring5.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 22:32
 */
public class TestAop {
    @Test
    public void testAopAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanproxy.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
