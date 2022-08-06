package com.ckstn0777.centralbook.service;

import com.ckstn0777.centralbook.entity.book.Book;
import com.ckstn0777.centralbook.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    public Long saveBook(Book book) {
        bookRepository.save(book);
        return book.getId();
    }
}
