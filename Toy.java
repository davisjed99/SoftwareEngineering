package csce247.assignments.factory;

public abstract class Toy {
	protected String name;
	
	public void assemble() {
		System.out.println("Putting together a " + name);
	}
	public void boxToy() {
		System.out.println("Putting the " + name + " in a box");
	}
	public void priceToy() {
		System.out.println("Adding price on " + name);
	}
}
