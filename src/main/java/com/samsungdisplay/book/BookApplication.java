package com.samsungdisplay.book;


import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.samsungdisplay.book.entity.Book;
import com.samsungdisplay.book.repository.BookRepository;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

    @Bean
    public CommandLineRunner initData(BookRepository bookRepository) {
        return args -> {
        	List<Book> books = List.of(
        		    new Book(null, "자바의 정석", "남궁성", LocalDate.of(2016, 7, 1), 4.7, true, 42000, 31.5),
        		    new Book(null, "토비의 스프링", "이일민", LocalDate.of(2018, 10, 10), 4.8, true, 65000, 49.0),
        		    new Book(null, "Clean code", "Robert C. Martin", LocalDate.of(2008, 8, 11), 4.7, true, 47000, 37.5),
        		    new Book(null, "Effective Java", "Joshua Bloch", LocalDate.of(2018, 1, 6), 4.9, true, 55000, 42.0),
        		    new Book(null, "Spring in action", "Craig Walls", LocalDate.of(2020, 3, 1), 4.5, true, 45000, 35.99),
        		    new Book(null, "모두의 데이터 분석", "송석리", LocalDate.of(2022, 5, 20), 4.3, false, 38000, 29.0),
        		    new Book(null, "객체지향의 사실과 오해", "조영호", LocalDate.of(2015, 7, 10), 4.6, false, 35000, 26.0),
        		    new Book(null, "도메인 주도 설계", "Eric Evans", LocalDate.of(2004, 8, 30), 4.2, true, 60000, 45.0),
        		    new Book(null, "Refactoring", "Martin Fowler", LocalDate.of(1999, 7, 8), 4.6, true, 52000, 40.0),
        		    new Book(null, "프로그래머, 열정을 말하다", "정재훈", LocalDate.of(2012, 3, 15), 4.1, false, 33000, 24.0)
        		);
            bookRepository.saveAll(books);
        };
    }
	
}
