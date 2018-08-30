package com.lambo.springbootcloudservicehystrix8013;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 加@EnableHystrix注解开启Hystrix
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
public class SpringbootCloudServiceHystrix8013Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudServiceHystrix8013Application.class, args);
	}
}
