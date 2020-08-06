package com.dh.test;

import com.dh.spring5.Book;
import com.dh.spring5.Order;
import com.dh.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-02 19:43
 */
public class TestSpring5 {
    @Test
    public void testAdd() {
        // 1.加载spring配置文件
        // 不提供开发人员进行使用
        // 加载配置文件时候不会创建对象，在获取对象（使用）才去创建对象
//        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");


        // BeanFactory的子接口，提供更多强大的功能。
        // 加载配置文件时候就会把在配置文件对象进行创建
        // ClassPathXmlApplicationContext：xml文件路径相对于类路径
        // FileSystemXmlApplicationContext：xml文件路径为绝对路径，对应盘符

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");


        //2.获取配置文件创建的对象：默认根据类的无参构造器创建一个对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);

        System.out.println(book);
    }


    @Test
    public void testPBook() {
        //通过p名称空间注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("pbook", Book.class);

        System.out.println(book);
    }


    @Test
    public void testOrder() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Order order = context.getBean("order", Order.class);

        System.out.println(order);
    }
}
