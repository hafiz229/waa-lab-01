package com.example.lab01.controller;

import com.example.lab01.model.Book;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String index() {
        return "Welcome to the Book Store";
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(
                new Book(1, "Harry Potter Part I", "J K Rowling", "24435"),
                new Book(2, "Harry Potter Part II", "J K Rowling", "34243")
        );
    }
}
