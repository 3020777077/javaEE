package com.dh.Spring5.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 22:56
 */
@Component
@Aspect
public class BookProxy {
    @Before(value = "execution(* com.dh.Spring5.aopxml.Book.buy(..))")
    public void before() {
        System.out.println("before....");
    }
}
