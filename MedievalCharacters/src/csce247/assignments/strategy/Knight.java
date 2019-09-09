package csce247.assignments.strategy;

public class Knight extends Character {
	public Knight (String name) {
		super(name);
	}
	public void display() {
		super.display();
		System.out.println(name + " is a valiant knight");
	}
	public void attack() {
		super.attack();
		setWeaponBehavior(new WeaponBow());
	}
}
