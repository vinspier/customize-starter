package com.vinspier.spring.start.service;

import org.springframework.stereotype.Component;

@Component
public class CustomizeServiceImpl implements CustomizeService {
    public void customize() {
        System.out.println("自定义启动包中的service bean");
    }
}
