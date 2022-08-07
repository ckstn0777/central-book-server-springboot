package com.ckstn0777.centralbook.service;

import com.ckstn0777.centralbook.entity.book.Book;
import com.ckstn0777.centralbook.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public Long saveBook(Book book) {
        bookRepository.save(book);
        return book.getId();
    }

    public Book findBook(Long id) {
        return bookRepository.findOne(id);
    }

    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }
}
