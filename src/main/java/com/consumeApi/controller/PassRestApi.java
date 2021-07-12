package com.consumeApi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consume.service.ConsumeApi;
import com.consumeApi.model.States;

@CrossOrigin(origins="*")
@RestController
public class PassRestApi {
	
	
	ConsumeApi consumeApi = new ConsumeApi();
	
	@RequestMapping("/covid19")
	public ResponseEntity<States> getRequestParm(){
		States state = consumeApi.getStates();
		return new ResponseEntity<States>(state,HttpStatus.OK);
	}
}
