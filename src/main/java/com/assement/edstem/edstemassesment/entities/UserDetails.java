package com.assement.edstem.edstemassesment.entities;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
    @Id
    private BigInteger user_contact_number;
    private String user_name;
    private String address;
    private String email;

    public BigInteger getUser_contact_number() {
        return user_contact_number;
    }
    public void setUser_contact_number(BigInteger user_contact_number) {
        this.user_contact_number = user_contact_number;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
