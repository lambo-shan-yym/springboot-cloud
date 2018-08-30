package com.lambo.springbootcloudservicefeign8012;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SpringbootCloudServiceFeign8012Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudServiceFeign8012Application.class, args);
	}
}
