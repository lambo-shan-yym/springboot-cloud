package com.lambo.springbootcloudservicefeign8012.feign;/**
 * @author yym
 * @create create by yym 2018/8/19 0019 11:43
 * @desc
 **/

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yym
 * @create 2018-08-19 11:43
 * @desc
 **/
@FeignClient(value = "service-helloworld")
public interface FeighHelloWorldService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
