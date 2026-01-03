package com.back.domain.post.post.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class Ap1V1Controller {
    private final PostService postService;

    @GetMapping
    public List<Post> getItems() {
        return postService.getPosts();
    }
}
