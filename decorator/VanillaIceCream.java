package csce247.assignments.decorator;

public class VanillaIceCream extends IceCream {
	//Describes selection
	public VanillaIceCream() {
		this.description = "Vanilla Ice Cream";
	}
	//Returns price
	public double getCost() {
		return 0.75;
	}
}
