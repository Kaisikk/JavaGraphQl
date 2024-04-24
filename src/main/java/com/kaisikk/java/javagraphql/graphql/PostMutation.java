package com.kaisikk.java.javagraphql.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.kaisikk.java.javagraphql.domain.Post;
import com.kaisikk.java.javagraphql.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostMutation implements GraphQLMutationResolver {

    @Autowired
    private PostService service;

    public Post createPost(String title, String author, String type){
        return service.createPost(title, author, type);
    }

}
