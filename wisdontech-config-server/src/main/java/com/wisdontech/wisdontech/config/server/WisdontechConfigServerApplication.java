package com.wisdontech.wisdontech.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WisdontechConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WisdontechConfigServerApplication.class, args);
	}
}