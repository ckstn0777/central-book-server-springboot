package com.ckstn0777.centralbook.controller;

import com.ckstn0777.centralbook.dto.BookFormDto;
import com.ckstn0777.centralbook.entity.book.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.ckstn0777.centralbook.service.BookService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BookApiController {
    private final BookService bookService;

    /**
     * 책 저장 API
     */
    @PostMapping("/api/v1/book")
    public void saveBook(@RequestBody BookFormDto bookFormDto) {
        Book book = Book.builder()
                        .title(bookFormDto.getTitle())
                        .author(bookFormDto.getAuthor())
                        .description(bookFormDto.getDescription())
                        .build();

        bookService.saveBook(book);
    }

    /**
     * 모든 책 리스트 조회 API
     */
    @GetMapping("/api/v1/book")
    public List<Book> getAllBook() {
        return bookService.findAllBook();
    }

    /**
     * 상세 책 정보를 가져오는 API
     */
    @GetMapping("/api/v1/book/{id}")
    public void getBook(@PathVariable("id") long id) {

    }
}
