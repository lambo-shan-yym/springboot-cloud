package com.lambo.springbootcloudservicefeign8012.controller;

import com.lambo.springbootcloudservicefeign8012.feign.FeighHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yym
 * @create create by yym 2018/8/19 0019 11:44
 * @desc ${DESCRIPTION}
 **/
@RestController
public class HelloController {
    @Autowired
    private FeighHelloWorldService feighHelloWorldService;
    @Autowired
    private Environment environment;

    @RequestMapping(value = "/hello")
    public String helloWorld(@RequestParam String name){
        return  feighHelloWorldService.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/info")
    public String info(){
        return " this is "+environment.getProperty("spring.application.name");
    }
}
