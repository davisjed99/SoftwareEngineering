package csce247.assignments.decorator;

public class Sprinkles extends ToppingsDecorator {
	//Create IceCream object
	IceCream iceCream;
	//Initialize Sprinkles
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	//Return modified description
	public String toString() {
		return iceCream.toString() + " + sprinkles";
	}
	//Returned modified cost
	public double getCost() {
		return iceCream.getCost() + 0.2;
	}
}
