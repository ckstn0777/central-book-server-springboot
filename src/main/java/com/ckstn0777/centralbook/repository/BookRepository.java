package com.ckstn0777.centralbook.repository;

import com.ckstn0777.centralbook.entity.book.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BookRepository {
    @PersistenceContext
    private EntityManager em;

    public void save(Book book) {
        em.persist(book);
    }

    public Book findOne(Long id) {
        return em.find(Book.class, id);
    }

    public List<Book> findAll() {
        return em.createQuery("select book from Book book", Book.class)
                .getResultList();
    }
}
