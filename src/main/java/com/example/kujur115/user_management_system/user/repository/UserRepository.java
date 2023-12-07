package com.example.kujur115.user_management_system.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kujur115.user_management_system.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    
} 
