package com.lambo.springbootcloudfeignhystrix8014.feign;

import org.springframework.stereotype.Component;

/**
 * @author yym
 * @create create by yym 2018/8/19 0019 14:35
 * @desc ${DESCRIPTION}
 **/
@Component
public class SchedualServiceHiHystric implements FeighHelloWorldService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
