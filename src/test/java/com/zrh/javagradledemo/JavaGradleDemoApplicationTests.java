package com.zrh.javagradledemo;

import com.zrh.javagradledemo.Users.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaGradleDemoApplicationTests {
    @Autowired
    public Users users;

    @Test
    void contextLoads() {
        System.out.printf("这个名子是：%s", users.getName());

    }

}
