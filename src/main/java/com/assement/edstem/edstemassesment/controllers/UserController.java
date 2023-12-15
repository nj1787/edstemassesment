package com.assement.edstem.edstemassesment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController{
    @GetMapping("/CMS/rest/api/welcome")
    public String testMethod(){
        return "Welcome To Contact Management Application";
    }
} 