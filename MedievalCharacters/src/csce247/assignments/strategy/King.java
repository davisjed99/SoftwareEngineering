package csce247.assignments.strategy;

public class King extends Character {
	public King(String name) {
		super(name);
	}
	public void display() {
		super.display();
		System.out.println(name + " is a Noble King");
	}
	public void attack() {
		super.attack();
		setWeaponBehavior(new WeaponSword());
	}
}
