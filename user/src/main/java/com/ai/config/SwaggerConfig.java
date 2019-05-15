package com.ai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger的配置流程：
 *  1、添加swagger 和 swagger-ui的依赖
 *  2、注册bean (SwaggerConfig)
 *  3、
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().
                //生成扫包范围
                apis(RequestHandlerSelectors.basePackage("com.ai.controller")).
                paths(PathSelectors.any()).build();
    }

    //创建api文档信息
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("user").description("this is user service").
                termsOfServiceUrl("www.baidu.com").version("1.0").build();
    }
}
