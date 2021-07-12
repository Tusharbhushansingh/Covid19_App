package com.consume.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumeApi.model.States;

@Service
public class ConsumeApi {

	public States getStates(){
		final String uri = "https://api.rootnet.in/covid19-in/stats/latest";
		RestTemplate restTemplate = new RestTemplate();
		States state = restTemplate.getForObject(uri, States.class);
		return state;
		
	}
}
