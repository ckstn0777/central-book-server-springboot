package com.ckstn0777.centralbook.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.ckstn0777.centralbook.service.BookService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/book")
public class BookApiController {
    private final BookService bookService;

    /**
     * 책 저장 API
     */
    @PostMapping("")
    public void saveBook() {

    }

    /**
     * 모든 책 리스트 조회 API
     */
    @GetMapping("")
    public void getAllBook() {

    }

    /**
     * 상세 책 정보를 가져오는 API
     */
    @GetMapping("/{id}")
    public void getBook(@PathVariable("id") long id) {

    }
}
