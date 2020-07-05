package com.vinspier.spring.start.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 该类为配置类
 * 指定扫描组件bean的位置
 *
 * @Conditional onBean/onClass 指定位置生效
 * @ConditionalOnProperty 要求在指定文件中配置才能生效
 *
 * @AutoConfigureAfter 指定在其他配置完成之后加载配置
 * */
@Configuration
@ComponentScan(value = {"com.vinspier.spring.start"})
@ConditionalOnProperty(prefix = "customize",name = "enable",havingValue = "true")
public class CustomizeAutoConfiguration {

}
