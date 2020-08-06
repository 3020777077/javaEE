package com.dh.Spring5.test;

import com.dh.Spring5.entiry.Book;
import com.dh.Spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestTemplate {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    BookService bookService = context.getBean("bookService", BookService.class);

    @Test
    public void add() {
        Book book = new Book(null, "java", "a");
        bookService.addBook(book);
    }

    @Test
    public void update() {
        Book book = new Book(1, "javaWeb", "b");
        bookService.updateBook(book);
    }

    @Test
    public void delete() {
        int id = 1;
        bookService.deleteBook(id);
    }


    @Test
    public void findCount() {
        int count = bookService.findCount();
        System.out.println(count);
    }

    @Test
    public void findOne() {
        Book book = bookService.queryBookById(2);
        System.out.println(book);
    }

    @Test
    public void findAll() {
        List<Book> books = bookService.queryAll();
        books.forEach(System.out::println);
    }

    @Test
    public void batchAdd() {
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"java", "a"};
        Object[] o2 = {"java1", "a1"};
        Object[] o3 = {"java2", "a2"};
        Object[] o4 = {"java3", "a3"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        batchArgs.add(o4);

        //调用批量添加
        bookService.batchAdd(batchArgs);
    }
}