package com.anqi.forumbase;

import com.anqi.forumbase.dao.UserDao;
import com.anqi.forumbase.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ForumBaseApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("111");
    }

    @Autowired
    UserServiceImpl userService;


    @Test
    void add() {
        userService.addUser("111","213");
    }


}
