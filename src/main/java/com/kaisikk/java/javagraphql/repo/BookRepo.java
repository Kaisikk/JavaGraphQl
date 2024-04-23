package com.kaisikk.java.javagraphql.repo;

import com.kaisikk.java.javagraphql.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
