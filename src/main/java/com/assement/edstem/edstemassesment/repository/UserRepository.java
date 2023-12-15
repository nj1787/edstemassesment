package com.assement.edstem.edstemassesment.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assement.edstem.edstemassesment.entities.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, BigInteger>{

}
