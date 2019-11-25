package csce247.assignments.state;

public class OrderedState implements State{
	private Package pkg;
	
	public OrderedState(Package pkg) {
		this.pkg = pkg;
	}
	
	//Implement State methods with unique messages based on transit state
	public void displayStatus() {
		System.out.println(pkg.getName() + " was ordered");
	}

	public void displayETA() {
		System.out.println(pkg.getName() + " should arrive in 5 to 7 business days");
	}

}