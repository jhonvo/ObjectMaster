package com.jhon.objectmaster;

public class Samurai extends Human {
	public static int count = 0; // Set public so it can be accessed from other classes. It starts from 0.
	
	public Samurai() {
		this.setHealth(200);
		count += 1;
	}
	
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth(this.getHealth()/2);
	}
	
	public void medidate() {
		this.setHealth(this.getHealth()+(this.getHealth()/2));
	}
	
	public void howMany() {
		System.out.println(String.format("The total of Samurais is %d", count));
	}

}
