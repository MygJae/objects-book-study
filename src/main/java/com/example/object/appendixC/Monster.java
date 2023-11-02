package com.example.object.appendixC;

public abstract class Monster {
	private int health;
	
	public Monster(int health) {
		this.health = health;
	}
	
	abstract public String getAttack();
}

