package csce247.assignments.decorator;

public class ChocolateChips extends ToppingsDecorator {
	//Create IceCream object
	IceCream iceCream;
	//Initialize ChocolateChips
	public ChocolateChips(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	//Return modified description
	public String toString() {
		return iceCream.toString() + " + chocolate chips";
	}
	//Returned modified cost
	public double getCost() {
		return iceCream.getCost() + 0.3;
	}
}
