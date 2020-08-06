package com.dh.Spring5.service;

import com.dh.Spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description 使用注解创建对象
 * 1.引用依赖：spring-aop-5.2.6.RELEASE.jar
 * 2.开启注解扫描：
 * <context:component-scan base-package="com.dh.Spring5"/>
 * 四个注解：都能实现创建对象
 * （1）@Component
 * （2）@Service
 * （3）@Controller
 * （4）@Repository
 * @Author MrZhou
 * @Date 2020-08-03 18:00
 */

//注解中value可以不写
//默认值是类名称，首字母小写
//UserService --> userService
//@Component(value = "userService")   //<bean id="userService" class=""/>
@Service
public class UserService {
    /**
     * 注入属性的四个注解：
     * 1.@Autowired ：根据类型进行注入
     * 2.@Qualifier(value="") ：根据属性名进行注入(配合@Autowired使用)
     * 3.@Resource：既可以根据类型注入，也可以根据名称注入（import javax.annotation.Resource;）
     * 根据类型注入：@Resource
     * 根据名称注入：@Resource(name = "userDaoImpl")
     *
     * 4.@Value：注入普通类型属性
     */

    //定义dao类型属性，不需要添加set方法
/*
    @Autowired  //根据类型进行注入
    @Qualifier(value = "userDaoImpl")  //根据属性名进行注入
    private UserDao dao;
*/

//    @Resource     //根据类型注入
    @Resource(name = "userDaoImpl") //根据名称注入
    private UserDao dao;

    @Value("abc")
    private String name;

    public void add() {
        System.out.println("service add...");
        dao.add();
        System.out.println(name);
    }

}
