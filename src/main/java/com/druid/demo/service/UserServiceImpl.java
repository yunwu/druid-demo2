package com.druid.demo.service;


import com.druid.demo.dao.UserDao;
import com.druid.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.findById(id).get();
    }

}
