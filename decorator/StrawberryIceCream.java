package csce247.assignments.decorator;

public class StrawberryIceCream extends IceCream {
	//Describes selection
	public StrawberryIceCream() {
		this.description = "Strawberry Ice Cream";
	}
	//Returns price
	public double getCost() {
		return 0.8;
	}
}
