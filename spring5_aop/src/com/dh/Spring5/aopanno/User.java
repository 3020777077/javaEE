package com.dh.Spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @Description 被增强的类
 * @Author MrZhou
 * @Date 2020-08-03 22:24
 */
@Component
public class User {
    public void add() {
//        int i = 10/0;
        System.out.println("add...");
    }
}
