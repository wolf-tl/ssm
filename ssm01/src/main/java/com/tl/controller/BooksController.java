package com.tl.controller;

import com.tl.pojo.Books;
import com.tl.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

/**
 * @author tl
 */
@Controller
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BooksService booksService;
    //查询所有书籍
    @RequestMapping("/allbooks")
    public String list(Model model) {
        List<Books> list = booksService.queryAllBook();
        model.addAttribute("list", list);
        return "allBooks";
    }
    //转到添加书籍页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "addbook";
    }
    //添加书籍
    @RequestMapping("/addbook")
    public String addBook(Books books){
        booksService.addBook(books);
        return "redirect:/books/allbooks";
    }
    //转到更新书籍页面
    @RequestMapping("/toUpdate")
    public String toUpdate(int id,Model model){
         Books books = booksService.queryBookById(id);
         model.addAttribute("Qbook",books);
         return "updateBook";
    }
    //更新书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        booksService.updateBook(books);
        //标准：return "redirect:/books/allbooks"
        //return "allbooks"直接转到/books/allbooks
        //return "allBooks"自动帮我们查询所有
        return "allBooks";
    }
    //删除书籍
    @RequestMapping("/del")
    public String deleteBook( int id){
        booksService.deleteBookById(id);
        return "redirect:/books/allbooks";
    }
}
