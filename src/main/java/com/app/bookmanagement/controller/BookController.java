package com.app.bookmanagement.controller;

import com.app.bookmanagement.entity.Book;
import com.app.bookmanagement.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping(value = "/book")
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(service.getBookList());
    }

    @GetMapping(value = "/book/{id}")
    public ResponseEntity<Optional<Book>> getBookById(@PathVariable int bookId) {
        return ResponseEntity.ok().body(this.service.getBookById(bookId));
    }

    @PostMapping(value = "/book")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(this.service.createBook(book));
    }

    @PostMapping(value = "/books")
    public ResponseEntity<List<Book>> createBookList(@RequestBody List<Book> list) {
        return ResponseEntity.ok(this.service.createBookList(list));
    }

    @PutMapping(value = "/book/")
    public ResponseEntity<Book> updateUser(@RequestBody Book book) {
        return ResponseEntity.ok().body(this.service.updateBookById(book));
    }

    @DeleteMapping(value = "/book/{id}")
    public HttpStatus deleteBookById(@PathVariable int id) {
        this.service.deleteBookById(id);
        return HttpStatus.OK;
    }
}
