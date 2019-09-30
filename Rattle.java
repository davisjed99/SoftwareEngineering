package csce247.assignments.factory;

public class Rattle extends Toy {
	public Rattle() {
		name = "rattle";
	}
	public void assemble() {
		super.assemble();
		System.out.println("Create the frame");
		System.out.println("Add the pebbles");
		System.out.println("Secure the sides");
	}
}
