package com.kaisikk.java.javagraphql;

import com.kaisikk.java.javagraphql.domain.Author;
import com.kaisikk.java.javagraphql.domain.Book;
import com.kaisikk.java.javagraphql.repo.AuthorRepo;
import com.kaisikk.java.javagraphql.repo.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaGraphQlApplication.class, args);
    }

    /**
     * Предзагрузка
     *
     * @param authorRepo
     * @param bookRepo
     * @return
     */
    @Bean
    public CommandLineRunner preload(AuthorRepo authorRepo, BookRepo bookRepo){
         return args -> {
             var author1 = new Author("Lev", "Tolstoy");
             var author2 = new Author("Harry", "Potter");
             var author3 = new Author("Mark", "Twen");

             var book1 = new Book("Anna Karenina");
             var book2 = new Book("Tow Sawyer");
             var book3 = new Book("Selfish Gen");

             book1.setAuthor(author1);
             book2.setAuthor(author2);
             book3.setAuthor(author3);

             bookRepo.save(book1);
             bookRepo.save(book2);
             bookRepo.save(book3);

             author1.setBook(book1);
             author2.setBook(book2);
             author3.setBook(book3);

             authorRepo.save(author1);
             authorRepo.save(author2);
             authorRepo.save(author3);
         };
    }

}
