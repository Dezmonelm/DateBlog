package com.dezzycode.dateblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "<h1>Welcome to Date Blog!</h1>" + "<br><h3>We remember that special moment!</h3>";
    }
}
