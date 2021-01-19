package com.cencosudscotiabank.conversionxml1.conversionxml1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Conversionxml1Application {

    public static void main(String[] args) {
        SpringApplication.run(Conversionxml1Application.class, args);
    }

}
