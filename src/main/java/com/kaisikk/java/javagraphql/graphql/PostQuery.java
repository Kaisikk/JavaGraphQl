package com.kaisikk.java.javagraphql.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kaisikk.java.javagraphql.domain.Post;
import com.kaisikk.java.javagraphql.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostQuery implements GraphQLQueryResolver {

    @Autowired
  private PostService postService;

    public List<Post> getPosts() {
        return postService.getAllPosts();
    }

    public Post getPost(long id){
        return postService.getPost(id);
    }

}
