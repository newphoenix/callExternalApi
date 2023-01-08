package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class CallExternalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallExternalApiApplication.class, args);
	}
	
	@Bean
	CommentsClient commentClient() {
		WebClient webClient = WebClient.builder()
				.baseUrl("https://jsonplaceholder.typicode.com/")
				.build();
		
		return HttpServiceProxyFactory
				.builder(WebClientAdapter.forClient(webClient))
				.build()
				.createClient(CommentsClient.class);
	}

}
