package csce247.assignments.observer;

public interface Subject {
	//Set the methods to be used by watchman
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	public void issueWarning(int warning);
}