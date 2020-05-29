package com.example.demo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @DateTime: 2020/5/29 - 11:03
 * @Description:
 */
@Configuration //配置类
@EnableSwagger2// 开启Swagger2的自动配置
public class SwaggerConfig {
//    @Bean //配置docket以配置Swagger具体参数
//    public Docket docket() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
//                .apis(RequestHandlerSelectors.basePackage("com.example.dome.controller"))
//                .paths(PathSelectors.ant("/**"))
//                .build();
//    }


}
