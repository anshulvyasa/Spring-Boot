package com.example.lecture4_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lecture4_crud.entity.Book;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByName(String name);
}