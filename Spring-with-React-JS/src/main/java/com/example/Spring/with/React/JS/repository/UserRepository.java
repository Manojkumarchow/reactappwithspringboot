package com.example.Spring.with.React.JS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.with.React.JS.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
