package com.dh.Spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description 完全使用注解开发
 * @Author MrZhou
 * @Date 2020-08-03 23:05
 */
@Configuration //做为配置类，替代xml配置文件
@ComponentScan(basePackages ={"com.dh.Spring5"}) //开启注解
@EnableAspectJAutoProxy(proxyTargetClass = true) //开启Aspect生成代理对象
public class ConfigAop {
}
