package com.dh.Spring5.test;

import com.dh.Spring5.bean.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 测试Bean创建实例的生命周期：
 * 第一步：执行无参构造器创建bean实例
 * 第二步：调用set方法设置属性值
 * 后置处理器：在初始化之前执行的方法：postProcessBeforeInitialization
 * 第三步：初始化方法
 * 后置处理器：在初始化之后执行的方法：postProcessAfterInitialization
 * 第四步：获取创建bean实例对象
 * 第五步：销毁的方法 ：context.close();
 *
 * @Author MrZhou
 * @Date 2020-08-03 16:46
 */
public class BeanLifeTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanlife.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步：获取创建bean实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        ((ClassPathXmlApplicationContext) context).close();
    }
}
