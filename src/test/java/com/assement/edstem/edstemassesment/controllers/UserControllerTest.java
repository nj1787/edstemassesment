package com.assement.edstem.edstemassesment.controllers;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.assement.edstem.edstemassesment.entities.UserDetails;
import com.assement.edstem.edstemassesment.repository.UserRepository;

public class UserControllerTest {

    @Autowired
    UserRepository repos;

    @Test
    void testCreateContact(@RequestBody UserDetails user) {
    }

    @Test
    void testDeleteSingleContact() {

    }

    @Test
    void testDisplayAllContacts() {

    }

    @Test
    void testDisplaySingleContact() {

    }
}
