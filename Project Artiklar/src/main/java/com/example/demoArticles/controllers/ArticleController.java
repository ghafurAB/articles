package com.example.demoArticles.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ArticleController {

    @GetMapping("/intro")
        public String introduction(){
            return ("welcome to the introduction page");

        }





}
