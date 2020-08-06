package com.dh.Spring5.service;

import java.util.List;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-02 22:33
 */
public class Book {
    List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
