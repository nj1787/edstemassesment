package com.assement.edstem.edstemassesment.entities;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
    @Id
    private BigInteger user_contact_number;
    private String user_name;
    private String user_address;
    private String user_email;
    
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
    public String getUser_address() {
        return user_address;
    }
    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }
    public String getUser_email() {
        return user_email;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

}
