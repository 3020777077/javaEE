package com.dh.Spring5.service;

import com.dh.Spring5.dao.BookDao;
import com.dh.Spring5.entiry.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 23:26
 */
@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    //修改
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    //删除
    public void deleteBook(int id) {
        bookDao.delete(id);
    }

    //查询表记录数
    public int findCount() {
        return bookDao.queryCount();
    }

    //通过id查询对象
    public Book queryBookById(int id) {
        return bookDao.queryBookById(id);
    }

    //查询返回集合
    public List<Book> queryAll() {
        return bookDao.queryAllBook();
    }

    //批量添加（修改和删除方法完全相同）
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook( batchArgs);
    }

}
