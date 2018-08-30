package com.lambo.springbootcloudprovider8010.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yym
 * @create create by yym 2018/8/13 0013 19:37
 * @desc ${DESCRIPTION}
 **/
@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());
   /* @Autowired
    private DiscoveryClient client;*/

   /* @Value("${spring.application.name}")
    private String serviceName;*/
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(@RequestParam(value = "name", defaultValue = "forezp") String name) {
       /* List<ServiceInstance> instances = client.getInstances(serviceName);
        for (int i = 0; i < instances.size(); i++) {
            System.out.println("/hello,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId()+ " name : "+name);
            logger.info("/hello,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId());
        }*/
        return "Hello World "+name+ " My port is "+ port;
    }
}
