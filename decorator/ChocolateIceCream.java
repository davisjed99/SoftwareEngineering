package csce247.assignments.decorator;

public class ChocolateIceCream extends IceCream {
	//Describes selection
	public ChocolateIceCream() {
		this.description = "Chocolate Ice Cream";
	}
	//Returns price
	public double getCost() {
		return 0.9;
	}
}
