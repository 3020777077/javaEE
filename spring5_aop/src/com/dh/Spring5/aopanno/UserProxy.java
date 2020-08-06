package com.dh.Spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description 创建增强类：编写增强逻辑
 * @Author MrZhou
 * @Date 2020-08-03 22:25
 */
@Component
@Aspect //生成代理对象
@Order(3)
public class UserProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.dh.Spring5.aopanno.User.add(..))")
    public void pointdemo() {
    }

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "pointdemo()")
    public void before() {
        System.out.println("before");
    }

    //最终通知
    @After(value = "pointdemo()")
    public void after() {
        System.out.println("after....");
    }

    //后置(返回)通知：有异常的话不执行
    @AfterReturning(value = "pointdemo()")
    public void afterReturning() {
        System.out.println("afterReturning...");
    }

    //异常通知：当代理的方法有异常的时候执行
    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing() {
        System.out.println("afterThrowing....");
    }

    //环绕通知
    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.....");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.....");
    }
}
