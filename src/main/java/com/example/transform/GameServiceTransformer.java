package com.example.transform;

import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.example.dto.GameInfoDto;
import com.example.model.GameInfo;

@Service
public class GameServiceTransformer {

	@Transformer
	public GameInfoDto modelToDto(@Payload GameInfo gameInfo) {
		return new GameInfoDto(gameInfo);
	}
	
}
