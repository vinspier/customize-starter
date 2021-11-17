package com.vinspier.web.controller;

import com.vinspier.spring.start.config.BusinessProperties;
import com.vinspier.spring.start.service.CustomizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private BusinessProperties businessProperties;

    /**
     * 由自定义的启动包产生源
     * */
    @Autowired
    private CustomizeService customizeService;

    @RequestMapping(value = "/find")
    public Object find(){
        customizeService.customize();
        return "ok";
    }

    @RequestMapping(value = "/config")
    public String config(){
        System.out.println(businessProperties.getDriverClassName());
        return businessProperties.getDriverClassName();
    }

}
