package com.app.bookmanagement.services;

import com.app.bookmanagement.entity.Book;
import com.app.bookmanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }
    public List<Book> createBookList(List<Book> list){
        return bookRepository.saveAll(list);
    }
    public List<Book> getBookList(){
        return bookRepository.findAll();
    }
    public Optional<Book> getBookById(int bookId){
        return bookRepository.findById(bookId);
    }
    public Book updateBookById(Book book) {
        Optional<Book> bookFound = bookRepository.findById(book.getBookId());

        if (bookFound.isPresent()) {
            Book bookUpdate = bookFound.get();
            bookUpdate.setDescription(book.getDescription());
            bookUpdate.setQuantity(book.getQuantity());

            return bookRepository.save(book);
        } else {
            return null;
        }
    }
    public String deleteBookById(int bookId) {
        bookRepository.deleteById(bookId);
        return "Book "+ bookId +" is deleted";
    }
}
