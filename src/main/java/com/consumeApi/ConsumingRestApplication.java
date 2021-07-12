package com.consumeApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.consumeApi.model.States;

@SpringBootApplication
public class ConsumingRestApplication {
	
	
	@Value("${covid.url}")
	private String covidUrl;
	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
            States states = restTemplate.getForObject("https://api.rootnet.in/covid19-in/stats/latest", States.class);
			//States states = restTemplate.getForObject(covidUrl, States.class);
			log.info(states.toString());
			System.out.println(states);
		};
	}	
	
}