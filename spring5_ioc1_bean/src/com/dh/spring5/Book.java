package com.dh.spring5;

/**
 * @Description 演示set方法进行注入属性
 * @Author MrZhou
 * @Date 2020-08-02 20:30
 */
public class Book {
    //创建属性
    private String bname;
    private String bauthor;
    private String baddress;

    public Book() {
    }

    //有参构造注入
    public Book(String bname) {
        this.bname = bname;
    }

    public static void main(String[] args) {
        Book book = new Book();

    }

    public void setBaddress(String baddress) {
        this.baddress = baddress;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", baddress='" + baddress + '\'' +
                '}';
    }

    //set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

}
