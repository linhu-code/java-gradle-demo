package com.zrh.javagradledemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = {"com.zrh.javagradledemo.mapper"})
public class JavaGradleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaGradleDemoApplication.class, args);
    }

}
