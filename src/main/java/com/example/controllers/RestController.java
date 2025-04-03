package com.example.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class RestController {

    @Get("/")
    public String getHello(){
        return "Hello World";
    }
}
