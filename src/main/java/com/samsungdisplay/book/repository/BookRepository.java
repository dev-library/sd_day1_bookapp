package com.samsungdisplay.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samsungdisplay.book.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
