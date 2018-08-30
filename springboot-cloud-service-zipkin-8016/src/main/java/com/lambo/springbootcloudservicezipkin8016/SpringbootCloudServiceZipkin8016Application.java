package com.lambo.springbootcloudservicezipkin8016;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class SpringbootCloudServiceZipkin8016Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudServiceZipkin8016Application.class, args);
	}
}
