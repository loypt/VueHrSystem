package com.susmote.vuehrsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.susmote.vuehrsystem.mapper")
@EnableCaching
public class VuehrsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(VuehrsystemApplication.class, args);
    }

}
