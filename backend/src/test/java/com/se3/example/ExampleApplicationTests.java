package com.se3.example;

import com.se3.example.Dao.UserDao;
import com.se3.example.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ExampleApplicationTests {
    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testRepository(){
        UserDao x=new UserDao(1,"lgl","123123",1,new Date());
        userRepository.save(x);
    }

}
