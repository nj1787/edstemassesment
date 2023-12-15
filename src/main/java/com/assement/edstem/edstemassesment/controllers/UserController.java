package com.assement.edstem.edstemassesment.controllers;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assement.edstem.edstemassesment.entities.UserDetails;
import com.assement.edstem.edstemassesment.repository.UserRepository;

@RestController
class UserController{

    @Autowired
    UserRepository repos;

    @GetMapping("/CMS/rest/api/contacts/all")
    public List<UserDetails> displayAllContacts(){
        return repos.findAll();
    }

    @GetMapping("/CMS/rest/api/contacts/{contactnum}")
    public UserDetails displaySingleContact(@PathVariable("contactnum") BigInteger number){
        return repos.findById(number).get();
    }

    
    @PostMapping("/CMS/rest/api/contacts/create")
    public UserDetails createContact(@RequestBody UserDetails user){
        UserDetails savedUser = repos.save(user);
        System.out.println("Contact Created Successfully!");
        return savedUser;
    }

    @DeleteMapping("/CMS/rest/api/contacts/delete/{contactnumber}")
    public String deleteSingleContact(@PathVariable BigInteger number){
        repos.deleteById(number);
        return "Contact Deleted Successfully";
    }
} 