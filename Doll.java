package csce247.assignments.factory;

public class Doll extends Toy {
	public Doll() {
		name = "doll";
	}
	public void assemble() {
		super.assemble();
		System.out.println("Connect all pieces");
		System.out.println("Paint the face");
		System.out.println("Add the dress");
		System.out.println("Add the shoes");
	}
}
