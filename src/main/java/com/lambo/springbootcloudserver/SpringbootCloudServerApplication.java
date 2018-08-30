package com.lambo.springbootcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  用Spring Boot创建一个服务类EurekaServerApplication，需要一个注解@EnableEurekaServer加在springboot工程的启动类上
 *  服务注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringbootCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudServerApplication.class, args);
	}
}
