package com.kaisikk.java.javagraphql.repo;

import com.kaisikk.java.javagraphql.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
