package com.empapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy()
public class EmpApisApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpApisApplication.class, args);
    }

}
