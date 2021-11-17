package com.vinspier.spring.start.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 该jar 业务配置类
 *
 * @author  xiaobiao.fan
 * @date    2021/11/17 1:43 下午
*/
@ConfigurationProperties(prefix = "customize.business")
@Component
public class BusinessProperties {

    private String driverClassName;

    private String url;

    private String username;

    private String password;

    public BusinessProperties() {

    }

    public BusinessProperties(String driverClassName, String url, String username, String password) {
        this.driverClassName = driverClassName;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
