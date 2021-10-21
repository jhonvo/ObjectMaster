package com.jhon.objectmastertest;
import com.jhon.objectmaster.Human;
import com.jhon.objectmaster.Ninja;
import com.jhon.objectmaster.Samurai;
import com.jhon.objectmaster.Wizard;

public class HumanTest{

	public static void main(String args []) {
		
		Human richard = new Human();
		Human ana = new Human();
		
		ana.attack(richard);
		ana.attack(richard);
		richard.attack(ana);
		richard.attack(ana);
		
		Wizard w = new Wizard();
		
//		w.printProfile();
//		w.heal(ana);
//		w.fireball(richard);
		
		
		Ninja n = new Ninja();
		
//		n.printProfile();
//		n.steal(ana);
//		n.runAway();
		
		Samurai s = new Samurai();
		Samurai s2 = new Samurai();
		Samurai s3 = new Samurai();
		
//		s.printProfile();
//		s.deathBlow(richard);
//		s.medidate();
//		s2.howMany();
		
		
		
	}
	
	
	
}
