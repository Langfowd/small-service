package com.ltf.studyspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @MapperScan 等同于配置了的MapperScannerConfigurer
//@MapperScan("com.ltf.studyspringboot.dao")
public class StudySpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpringbootApplication.class, args);
    }
}
