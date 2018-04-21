package com.example.dto;

import com.example.model.GameInfo;
import com.example.model.GamePlatform;

public class GameInfoDto {

	private int id;
	private String name;
	private float price;
	private GamePlatform platform;
	private float rating;

	public GameInfoDto() {
		super();
	}

	public GameInfoDto(GameInfo gameInfo) {
		super();
		this.id = gameInfo.getId();
		this.name = gameInfo.getName();
		this.price = gameInfo.getPrice();
		this.platform = gameInfo.getPlatform();
		this.rating = 3.5f;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public GamePlatform getPlatform() {
		return platform;
	}

	public void setPlatform(GamePlatform platform) {
		this.platform = platform;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
}
