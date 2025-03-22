package com.spring.db.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.db.user.User;

public interface UserRepositery extends JpaRepository<User, Integer>{

}
