package com.anqi.forumbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.anqi.forumbase.dao")
public class ForumBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForumBaseApplication.class, args);
        System.out.println("start success");
    }

}
