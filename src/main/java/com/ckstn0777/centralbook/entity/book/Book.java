package com.ckstn0777.centralbook.entity.book;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Table(name = "tb_book")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String author;

    @Column(length = 1024)
    private String description;

    @Column(length = 24)
    private String publisher;

    private String imageUrl;

    private int price;

    private String link;

    @Builder
    public Book(String title, String author, String description, String publisher,
                String imageUrl, int price, String link) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.publisher = publisher;
        this.imageUrl = imageUrl;
        this.price = price;
        this.link = link;
    }
}



