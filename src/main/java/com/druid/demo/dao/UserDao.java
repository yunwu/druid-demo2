package com.druid.demo.dao;


import com.druid.demo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {}

