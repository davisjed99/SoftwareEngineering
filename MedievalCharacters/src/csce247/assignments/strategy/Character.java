package csce247.assignments.strategy;

public abstract class Character {
	protected String name;
	protected WeaponBehavior weaponBehavior;
	
	public Character(String name) {
		this.name = name;
	}
	public void attack() {
		
	}
	public void display() {
		System.out.println("------" + name + "------");
	}
	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
}
