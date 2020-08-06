package com.dh.Spring5.dao;

import com.dh.Spring5.entiry.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author MrZhou
 * @Date 2020-08-03 23:26
 */
@Repository
public class BookDaoImpl implements BookDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBook(Book book) {
        String sql = "insert into t_book(`name`,status) values(?,?)";
        int update = jdbcTemplate.update(sql, book.getName(), book.getStatus());
        System.out.println("成功添加" + update + "条记录");
    }

    @Override
    public void update(Book book) {
        String sql = "update t_book set `name` =? ,status=? where bid = ?";
        int update = jdbcTemplate.update(sql, book.getName(), book.getStatus(), book.getId());
        System.out.println("成功修改" + update + "条记录");
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from t_book where bid = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println("成功删除" + update + "条记录");
    }

    /*
    查询某个值
    queryForObject：参数 ：sql , args , 返回结果的类型 .class；
     */
    @Override
    public int queryCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book queryBookById(int id) {
        String sql = "select bid id,`name`,status from t_book where bid = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> queryAllBook() {
        String sql = "select bid id,`name`,status from t_book ";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book(`name`,status) values(?,?)";
        //返回运行影响行数结果集合
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
