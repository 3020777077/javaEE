package com.dh.Spring5.factorybean;

import com.dh.Spring5.service.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 16:18
 */
public class MyBean implements FactoryBean<Course> {
    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

}
