package com.dh.Spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 完全注解开发，使用AnnotationConfigApplicationContext加载配置类
 * @Author MrZhou
 * @Date 2020-08-03 18:54
 */
@Configuration //做为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.dh.Spring5"})
public class SpringConfig {
}
