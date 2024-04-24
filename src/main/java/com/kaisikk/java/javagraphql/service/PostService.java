package com.kaisikk.java.javagraphql.service;

import com.kaisikk.java.javagraphql.domain.Post;
import com.kaisikk.java.javagraphql.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PostService  {

    @Autowired
    PostRepository repository;

    public List<Post> getAllPosts(){
        return repository.findAll();
    }

    public Post getPost(long id){
        return repository.getById(id);
    }

    public Post createPost(String title, String author, String type){
        final Post post = new Post();
        post.setAuthor(author);
        post.setTitle(title);
        post.setType(type);
        post.setCreatedDate(LocalDate.now());
        return repository.save(post);
    }



}


