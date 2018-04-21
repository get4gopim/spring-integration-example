package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import com.example.model.GameInfo;
import com.example.model.GamePlatform;
import com.example.model.QueryRequest;

@Service
public class GameService {
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	private static List<GameInfo> gamesList = new ArrayList<>();

	static {
		gamesList.add(new GameInfo(1, "Eagle PSVR", 2799, GamePlatform.PS4));
		gamesList.add(new GameInfo(2, "The Last of US", 1499, GamePlatform.PS3));
	}

	public List<GameInfo> getGames() {
		LOGGER.info("GameService.getGames() ...");
		
		return gamesList;
	}
	
	public GameInfo findOne(@Header("originalRequest") QueryRequest originalRequest) {
		LOGGER.info("GameService.findOne() : " + originalRequest);
		
		for (GameInfo game : gamesList ) {
			if (game.getId() == originalRequest.getId()) {
				return game;
			}
		}
		return null;
	}

}
