package com.ckstn0777.centralbook.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

import com.ckstn0777.centralbook.entity.book.Book;

@Transactional(readOnly = true)
@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void 도서저장_이후_조회해서_비교() {
        // given
        Book book1 = Book.builder()
                .title("리액트를 다루는 기술")
                .author("김민준")
                .build();

        bookRepository.save(book1);

        // when
        Book book2 = bookRepository.findOne(book1.getId());

        // then
        assertEquals(book1.getTitle(), book2.getTitle());
    }
}