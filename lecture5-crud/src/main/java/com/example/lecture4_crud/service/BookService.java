package com.example.lecture4_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lecture4_crud.entity.Book;
import com.example.lecture4_crud.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book) {
        Book save = bookRepository.save(book);
        return save;
    }

    public List<Book> findBookByTitle(String nameString) {
        List<Book> book = bookRepository.findByName(nameString);
        return book;
    }

}
