package csce247.assignments.observer;

public class Teacher implements Observer{
	//Create variable watchman as Subject
	private Subject watchman;
	//Was not in the requirement but this was my best guess to get it to work :(
	private Teacher teach;
	
	//Initialize ShopOwner with Subject watchman for some reason
	public Teacher(Subject watchman) {
		//this.watchman = watchman;
		//Register into the list
		watchman.registerObserver(teach);
	}
	//Send correct message with the right warning int
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Teacher: Helps get every kid home safe");
		} else if (warning == 2) {
			System.out.println("Teacher: Brings all students to the underground shelter");
		} else {
			System.out.println("That warning doesn't make any sense!");
		}
	}
}
