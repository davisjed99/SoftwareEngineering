package csce247.assignments.state;

public class DeliveredState implements State{
	private Package pkg;
	
	public DeliveredState(Package pkg) {
		this.pkg = pkg;
	}

	//Implement State methods with unique messages based on transit state
	public void displayStatus() {
		System.out.println(pkg.getName() + " is here for you");
	}

	public void displayETA() {
		System.out.println(pkg.getName() + " is here");
	}
}