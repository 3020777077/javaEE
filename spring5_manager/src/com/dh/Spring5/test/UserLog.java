package com.dh.Spring5.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 手动添加日志信息
 * @Author MrZhou
 * @Date 2020-08-04 19:40
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
