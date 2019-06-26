package com.ai.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: wangql
 * @Date: 2019/4/22 20:01
 * @Description:
 */
@Configuration
public class UserConfig {

    //把该方法创建的对象放到ioc容器里
    @Bean
    //加入负载均衡厕所，默认是轮训yuanc
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}