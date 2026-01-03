package com.back.domain.post.post.service;

import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public Long count() {
        return postRepository.count();
    }

    public void write(String title, String content) {
        Post post = Post
                .builder()
                .title(title)
                .content(content)
                .build();

        postRepository.save(post);
    }
}
