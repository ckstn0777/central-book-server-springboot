package com.ckstn0777.centralbook.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * 도서 저장을 위한 Dto
 */
@Getter @Setter
public class BookFormDto {
    @NotBlank(message = "도서 제목은 필수 입력값입니다.")
    private String title;

    @NotBlank(message = "작가명은 필수 입력값입니다.")
    private String author;

    private String description;

    public BookFormDto(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }
}
