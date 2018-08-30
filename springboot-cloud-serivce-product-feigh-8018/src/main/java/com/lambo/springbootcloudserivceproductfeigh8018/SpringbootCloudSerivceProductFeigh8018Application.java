package com.lambo.springbootcloudserivceproductfeigh8018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootCloudSerivceProductFeigh8018Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudSerivceProductFeigh8018Application.class, args);
	}
}
