package com.dh.Spring5.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-02 22:07
 */
public class Stu {
    //1.数组类型属性
    private String[] courses;

    //2.集合类型
    private List<String> list;

    //3.Map集合
    private Map<String, String> map;

    //4.Set集合
    private Set<String> set;

    //5.对象集合
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void test() {
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
        System.out.println(courseList);
    }
}
