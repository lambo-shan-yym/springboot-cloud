package com.lambo.springbootcloudprovider8010;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 使用@EnableEurekaClient注解表明是client
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
public class SpringbootCloudProvider8010Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudProvider8010Application.class, args);
	}
}
