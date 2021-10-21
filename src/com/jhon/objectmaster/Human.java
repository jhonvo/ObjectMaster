package com.jhon.objectmaster;

public class Human {
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
    // Getters & Setters
	
	public int getStrength() {
		return this.strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return this.stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return this.intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	// Methods
	
	public void attack(Human human){ //This means it will receive an object of the calls Human
		// human.health -= this.strength;
		int newHealth = human.health - this.strength;
		human.setHealth(newHealth);
	}
	
	public void printHealth() {
		System.out.println("The health level is " + this.getHealth());
	}
	
	public void printProfile() {
		System.out.println("The strength level is " + this.strength);
		System.out.println("The health level is " + this.health);
		System.out.println("The intelligence level is " + this.intelligence);
		System.out.println("The shealth level is " + this.stealth);
	}
	
}
