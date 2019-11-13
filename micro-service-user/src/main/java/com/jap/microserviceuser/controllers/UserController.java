package com.jap.microserviceuser.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "/all")
    public String all() {
        return "get All Users";
    }
}
