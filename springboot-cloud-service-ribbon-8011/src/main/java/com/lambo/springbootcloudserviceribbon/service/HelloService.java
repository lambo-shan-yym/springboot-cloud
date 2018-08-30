package com.lambo.springbootcloudserviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yym
 * @create create by yym 2018/8/19 0019 11:16
 * @desc ${DESCRIPTION}
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String helloWorldService(String name){
        return restTemplate.getForObject("http://service-helloworld/hello?name="+name,String.class);
    }
}
