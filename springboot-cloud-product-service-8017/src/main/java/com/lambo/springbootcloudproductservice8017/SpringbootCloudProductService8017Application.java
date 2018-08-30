package com.lambo.springbootcloudproductservice8017;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootCloudProductService8017Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudProductService8017Application.class, args);
	}
}
