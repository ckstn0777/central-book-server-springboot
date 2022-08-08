package com.ckstn0777.centralbook.controller;

import com.ckstn0777.centralbook.dto.BookFormDto;
import com.ckstn0777.centralbook.entity.book.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import com.ckstn0777.centralbook.service.BookService;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class BookApiController {
    private final BookService bookService;

    /**
     * 책 저장 API
     */
    @PostMapping("/api/v1/book")
    public ResponseEntity<?> saveBook(@Validated @RequestBody BookFormDto bookFormDto) {
        Book book = Book.builder()
                        .title(bookFormDto.getTitle())
                        .author(bookFormDto.getAuthor())
                        .description(bookFormDto.getDescription())
                        .build();

        return ResponseEntity.ok().body(bookService.saveBook(book));
    }

    /**
     * 모든 책 리스트 조회 API
     */
    @GetMapping("/api/v1/book")
    public List<Book> getAllBook() {
        throw new RuntimeException();
    }

    /**
     * 상세 책 정보를 가져오는 API
     */
    @GetMapping("/api/v1/book/{id}")
    public void getBook(@PathVariable("id") long id) {

    }
}
