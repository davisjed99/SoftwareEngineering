package csce247.assignments.template;

public abstract class House {
	
	//Starting point
	public void main(String[] args) {
		prepFoundation();
		createFrame();
	}
	
	public final void prepFoundation() {
		createFrame();
		installDrywall();
		addWindows();
		addElectrical();
		addPlumbing();
	}
	
	//Abstract method
	public abstract void createFrame();
	
	public void installDrywall() {
		System.out.println("Drywall: Creating the interior walls.");
	}
	
	public void addElectrical() {
		System.out.println("Electrical: Running all the wires and hooking up the power.");
	}
	
	public void addPlumbing() {
		System.out.println("Plumbing: Letting water run throug the house.");
	}
	
	public void addWindows() {
		System.out.println("Windows: Putting in the glass for the windows.");
	}
	
}
