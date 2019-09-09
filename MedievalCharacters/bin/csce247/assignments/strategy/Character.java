
public abstract class Character {
	private String name;
	private WeaponBehavior weaponBehavior;
	public Character(String name) {
		this.name = name;
	}
	public void attack();
	public void setWeaponBehavior(WeaponBehavior weaponBehavior);
	public void display();
	
}
