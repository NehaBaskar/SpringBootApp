package com.demo.LibraryManagement.Controller;

import com.demo.LibraryManagement.Entity.Books;
import com.demo.LibraryManagement.Service.AppInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/inventory")
public class BooksController {

    private AppInterface bookService;

    @Autowired
    public BooksController(AppInterface bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String showListOfBooks(Model theModel) {
        List<Books> bookList = bookService.getBookList();
        theModel.addAttribute("bookList",bookList);
        return "displayBooks";
    }
}
