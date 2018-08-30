package com.lambo.springbootcloudservicehystrix8013.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloWorldService(String name){
        return restTemplate.getForObject("http://service-helloworld/hello?name="+name,String.class);
    }

    public String helloError(String name){
        return "hello,"+name+" sorry,error!";
    }
}
