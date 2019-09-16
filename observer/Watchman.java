package csce247.assignments.observer;

import java.util.ArrayList;

public class Watchman implements Subject{
	//Create list of observers
	private ArrayList<Observer> observers;
	
	//Initialize Watchman()
	public Watchman() {
		this.observers = new ArrayList<Observer>();
	}
	//Add an observer to the list
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}
	//Remove an observer from the list
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}
	//Honestly not sure what this is supposed to do
	public void notifyObservers() {
		/*for (Observer observer : observers) {
			//observer.update(warning);
		}*/
	}
	//Send out a warning (1 or 2) to each observer, uncommenting line 30 breaks my code
	public void issueWarning(int warning) {
		for (Observer observer : observers) {
			//observer.update(warning);
		}
	}
}
