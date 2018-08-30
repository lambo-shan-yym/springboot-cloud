package com.lambo.springbootcloudfeignhystrix8014;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SpringbootCloudFeignHystrix8014Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudFeignHystrix8014Application.class, args);
	}
}
