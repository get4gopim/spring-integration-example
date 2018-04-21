package com.example.model;

public class GameInfo {

	private int id;
	private String name;
	private float price;
	private GamePlatform platform;
	
	public GameInfo() {
		super();
	}

	public GameInfo(int id, String name, float price, GamePlatform platform) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.platform = platform;
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

}
