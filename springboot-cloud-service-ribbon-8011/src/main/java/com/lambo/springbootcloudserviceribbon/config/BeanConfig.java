package com.lambo.springbootcloudserviceribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yym
 * @create create by yym 2018/8/19 0019 11:14
 * @desc ${DESCRIPTION}
 **/
@Configuration
public class BeanConfig {

    /**
     * 并且向程序的ioc注入一个bean: restTemplate;
     * 并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
