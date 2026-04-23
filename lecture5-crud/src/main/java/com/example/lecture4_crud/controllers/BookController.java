package com.example.lecture4_crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lecture4_crud.entity.Book;
import com.example.lecture4_crud.service.BookService;

@RestController
@RequestMapping("/book/v1")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/getBook")
    public ResponseEntity<List<Book>> getBookByTitle(@RequestParam("bookName") String bookName) {
        List<Book> books = bookService.findBookByTitle(bookName);
        return ResponseEntity.ok(books);
    }
}
