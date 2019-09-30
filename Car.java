package csce247.assignments.factory;

public class Car extends Toy {
	public Car() {
		name = "car";
	}
	public void assemble() {
		super.assemble();
		System.out.println("Make the body");
		System.out.println("Add the wheels");
		System.out.println("Paint the car");
	}
}
