package com.dh.Spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description 多个增强类对同一个方法进行增强，设置增强类的优先级
 * 通过注解@Order来设置优先级：值越小，优先级越高
 * @Author MrZhou
 * @Date 2020-08-03 22:48
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    @Before(value = "execution(* com.dh.Spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("Person Before...");
    }
}
