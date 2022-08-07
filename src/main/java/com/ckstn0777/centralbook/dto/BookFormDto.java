package com.ckstn0777.centralbook.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 도서 저장을 위한 Dto
 */
@Getter @Setter
public class BookFormDto {
    private String title;
    private String author;
    private String description;

    public BookFormDto(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }
}
