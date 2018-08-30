package com.lambo.springbootcloudservicehystrix8013.controller;


import com.lambo.springbootcloudservicehystrix8013.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yym
 * @create create by yym 2018/8/19 0019 11:18
 * @desc ${DESCRIPTION}
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/helloWorld")
    public String helloWorld(@RequestParam String name){
        return helloService.helloWorldService(name);
    }
}
