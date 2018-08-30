package com.lambo.springbootcloudserviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
public class SpringbootCloudServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudServiceRibbonApplication.class, args);
	}
}
