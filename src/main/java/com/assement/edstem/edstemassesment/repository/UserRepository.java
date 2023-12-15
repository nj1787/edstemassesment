package com.assement.edstem.edstemassesment.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assement.edstem.edstemassesment.entities.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, BigInteger>{

}
