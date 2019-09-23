package csce247.assignments.decorator;
//Abstract IceCream class allows ice cream classes to inherit toString() and getCost()
public abstract class IceCream {
	protected String description;
	
	public String toString() {
		return description;
	}
	
	public abstract double getCost();
}
