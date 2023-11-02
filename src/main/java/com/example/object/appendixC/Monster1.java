package com.example.object.appendixC;

public class Monster1 {
	private int health;
	private Breed breed;
	
	public Monster1(Breed breed) {
		this.health = breed.getHealth();
	}
	
	public String getAttack() {
		return breed.getAttack();
	}
}

