package com.tl.service;

import com.tl.dao.BooksMapper;
import com.tl.pojo.Books;

import java.util.List;

/**
 * @author tl
 */
public class BooksServiceImpl implements BooksService {
    private BooksMapper booksMapper;

    public BooksMapper getBooksMapper() {
        return booksMapper;
    }

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public BooksServiceImpl(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public BooksServiceImpl() {
    }

    public int addBook(Books book) {
        return booksMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return booksMapper.queryAllBook();
    }
}
