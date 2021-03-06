package com.springcloud.consul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	DiscoveryClient discoveryClient;

	@GetMapping("/info")
	public String info() {
		String services = "Hello Services: " + discoveryClient.getServices();
		System.out.println(services);
		return services;
	}

	@GetMapping("/hystrix")
	public String hystrix() throws InterruptedException {
		Thread.sleep(5000L);
		String services = "Services: " + discoveryClient.getServices();
		System.out.println(services);
		return services;
	}
}
