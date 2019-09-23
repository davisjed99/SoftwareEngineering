package csce247.assignments.decorator;

public class Cherry extends ToppingsDecorator {
	//Create IceCream object
	IceCream iceCream;
	//Initialize Cherry
	public Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	//Return modified description
	public String toString() {
		return iceCream.toString() + " + a cherry on top";
	}
	//Returned modified cost
	public double getCost() {
		return iceCream.getCost() + 0.4;
	}
}
