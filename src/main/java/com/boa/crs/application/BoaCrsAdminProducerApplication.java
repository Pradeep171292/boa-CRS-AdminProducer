package com.boa.crs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration
@EnableJpaRepositories("com.boa.crs.repo")
@EntityScan("com.boa.crs.entity")
@ComponentScan("com.boa.crs.*")
@EnableDiscoveryClient

public class BoaCrsAdminProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaCrsAdminProducerApplication.class, args);
	}

}
