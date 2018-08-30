package com.lambo.springbootcloudservicezuul8015;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootCloudServiceZuul8015Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudServiceZuul8015Application.class, args);
	}
}
