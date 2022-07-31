package com.ckstn0777.centralbook.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Table(name = "book")
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

    @Column(length = 13)
    private String isbn;

    @Column(length = 24)
    private String publisher;

    private String imageUrl;

    private int price;

    @Column(length = 20)
    private String category;

    private String link;
}



