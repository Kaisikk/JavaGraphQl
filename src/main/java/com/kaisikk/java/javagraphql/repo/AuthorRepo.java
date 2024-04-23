package com.kaisikk.java.javagraphql.repo;

import com.kaisikk.java.javagraphql.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
