package com.lambo.springbootcloudfeignhystrix8014.controller;


import com.lambo.springbootcloudfeignhystrix8014.feign.FeighHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
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
    FeighHelloWorldService feighHelloWorldService;


    @RequestMapping(value = "hello")
    public String helloWorld(@RequestParam String name){
        return  feighHelloWorldService.sayHiFromClientOne(name);
    }
}
