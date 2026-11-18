package com.MHZCE.springbootDemo.service;

import com.MHZCE.springbootDemo.entity.Book;
import com.MHZCE.springbootDemo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository =bookRepository;
    }

    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }

    public Book getBookById(int id){
        return bookRepository.findById(id);
    }
}
