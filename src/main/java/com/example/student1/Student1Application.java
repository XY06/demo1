package com.example.student1;

import com.sun.glass.ui.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bawei")
@MapperScan("com.bawei.mapper")
public class Student1Application {

    public static void main(String[] args) {
        SpringApplication.run(Student1Application.class, args);
    }

    /*protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Student1Application.class);
    }*/

}
