package com.druid.demo.service;


import com.druid.demo.model.User;

public interface UserService {
    User findById(Long id);
}
