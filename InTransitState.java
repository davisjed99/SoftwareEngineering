package csce247.assignments.state;

public class InTransitState implements State{
	private Package pkg;
	
	public InTransitState(Package pkg) {
		this.pkg = pkg;
	}

	//Implement State methods with unique messages based on transit state
	public void displayStatus() {
		System.out.println(pkg.getName() + " is out for delivery");
	}

	public void displayETA() {
		System.out.println(pkg.getName() + " should arrive within 5 days");
	}
}