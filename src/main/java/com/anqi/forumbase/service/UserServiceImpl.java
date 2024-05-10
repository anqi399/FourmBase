package com.anqi.forumbase.service;

import com.anqi.forumbase.dao.UserDao;
import com.anqi.forumbase.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    UserDao userDao;

    public void addUser(String username, String password) {
        userDao.insert(new UserPojo(username, password));
    }
}
