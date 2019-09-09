package csce247.assignments.strategy;

public class Queen extends Character {
	public Queen(String name) {
		super(name);
	}
	public void display() {
		super.display();
		System.out.println(name + " is a beautiful queen");
	}
	public void attack() {
		super.attack();
		setWeaponBehavior(new WeaponKnife());
	}
}
