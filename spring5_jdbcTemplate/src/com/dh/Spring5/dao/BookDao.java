package com.dh.Spring5.dao;

import com.dh.Spring5.entiry.Book;

import java.util.List;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 23:26
 */
public interface BookDao {
    //添加
    void addBook(Book book);

    //修改
    void update(Book book);

    //删除
    void delete(Integer id);

    //查询表记录数
    int queryCount();

    //通过id查询对象
    Book queryBookById(int id);

    //查询对象集合
    List<Book> queryAllBook();

    //批量添加
    void batchAddBook(List<Object[]> batchArgs);
}
