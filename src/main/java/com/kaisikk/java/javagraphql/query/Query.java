package com.kaisikk.java.javagraphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kaisikk.java.javagraphql.domain.Author;
import com.kaisikk.java.javagraphql.domain.Book;
import com.kaisikk.java.javagraphql.repo.AuthorRepo;
import com.kaisikk.java.javagraphql.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    AuthorRepo authorRepo;

    @Autowired
    BookRepo bookRepo;

    public List<Book> getBooks(){
        return bookRepo.findAll();
    }

    public List<Author> getAuthors(){
        return authorRepo.findAll();
    }

    public List<Author> getAuthors(Long first, Long last){
        if(last == 0 || last < first){
            last = (long) this.authorRepo.count();
        }

        return this.authorRepo.findAllById(
                LongStream.rangeClosed(first, last)
                        .boxed()
                        .collect(Collectors.toList())
        );
    }

}
