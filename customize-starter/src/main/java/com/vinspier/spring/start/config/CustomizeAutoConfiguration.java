package com.vinspier.spring.start.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 该类为配置类
 * 指定扫描组件bean的位置
 * */
@Configuration
@ComponentScan(value = {"com.vinspier.spring.start"})
public class CustomizeAutoConfiguration {

}
