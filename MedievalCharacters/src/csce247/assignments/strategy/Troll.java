package csce247.assignments.strategy;

public class Troll extends Character {
	public Troll(String name) {
		super(name);
	}
	public void display() {
		super.display();
		System.out.println(name + " is a funny troll");
	}
	public void attack() {
		super.attack();
		setWeaponBehavior(new WeaponAxe());
	}
}
