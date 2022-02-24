package com.tl.service;

import com.tl.pojo.Books;

import java.util.List;

/**
 * @author tl
 */
public interface BooksService {
    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int bookID);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int bookID);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();
}