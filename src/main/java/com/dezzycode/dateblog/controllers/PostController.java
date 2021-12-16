package com.dezzycode.dateblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String indexPosts(){
        return "post index";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String individualPosts(){
        return "individual post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewCreatePosts(){
        return "create post form";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "new post";
    }
}
