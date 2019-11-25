package csce247.assignments.state;

public class Package {
	//Sset a bunch of variables
	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	
	private String name;
	
	private State state;
	
	//Constructor
	public Package(String contents) {
		orderedState = new OrderedState(this);
		inTransitState = new InTransitState(this);
		deliveredState = new DeliveredState(this);
		
		this.setName(contents);
		
	}
	public void order() {
		//Change order state, display status and ETA
		setState(getOrderedState());
		state.displayStatus();
		state.displayETA();
	}
	public void mail() {
		//Change order state, display status and ETA
		setState(getInTransitState());
		state.displayStatus();
		state.displayETA();
	}
	public void received() {
		//Change order state, display status and ETA
		setState(getDeliveredState());
		state.displayStatus();
		state.displayETA();
	}
	//Getters and setters
	public void setState(State state) {
		this.state = state;
	}
	public State getOrderedState() {
		return orderedState;
	}
	public State getInTransitState() {
		return inTransitState;
	}
	public State getDeliveredState() {
		return deliveredState;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
