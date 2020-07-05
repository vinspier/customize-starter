package com.vinspier.ioc;

import com.vinspier.ioc.controller.IocController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocApplication {
    public static void main(String[] args) {
        SpringApplication.run(IocController.class,args);
    }
}
