package com.example.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.GameInfoDto;
import com.example.model.GameInfo;
import com.example.model.Greeting;
import com.example.model.QueryRequest;
import com.example.service.GameService;

@RestController
public class GreetingsController {
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	@Autowired
	private GameService service;
	
	@Autowired
	private Gateway gateway;

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping("/games")
	public List<GameInfo> getGames() {
		return service.getGames();
	}
	
	@RequestMapping("/send")
	public Greeting sendMsg() {
		LOGGER.info("sendMsg");
		gateway.send("hi this is NEW");
		return new Greeting(counter.incrementAndGet(), String.format(template, "TRDY"));
	}
	
	@RequestMapping("/games/{id}")
	public GameInfoDto findGameById(final @PathVariable int id) {
		QueryRequest queryReq = new QueryRequest();
		queryReq.setId(id);
		queryReq.setQueryName("search");
		
		return gateway.findOne(queryReq);
	}

}
