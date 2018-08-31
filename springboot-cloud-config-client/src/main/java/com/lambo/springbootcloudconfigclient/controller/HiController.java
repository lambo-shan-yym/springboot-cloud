package com.lambo.springbootcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yym
 * @create create by yym 2018/8/31 0031 15:34
 * @desc
 **/
@RestController
public class HiController {

    @Value("${version}")
    String version;

    @RequestMapping("/hi")
    public String hi() {
        return version;
    }
}
