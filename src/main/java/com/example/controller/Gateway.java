package com.example.controller;

import org.springframework.messaging.handler.annotation.Payload;

import com.example.dto.GameInfoDto;
import com.example.model.QueryRequest;

public interface Gateway {
	
	void send(String s);
	
	GameInfoDto findOne(@Payload final QueryRequest queryRequest);
	
}
