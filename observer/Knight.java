package csce247.assignments.observer;

public class Knight implements Observer {
	//Create variable watchman as Subject
	private Subject watchman;
	//Was not in the requirement but this was my best guess to get it to work :(
	private Knight knight;
	
	//Initialize ShopOwner with Subject watchman for some reason
	public Knight(Subject watchman) {
		//this.watchman = watchman;
		//Register into the list
		watchman.registerObserver(knight);
	}
	//Send correct message with the right warning int
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Knight: Helps everyone get home safe");
		} else if (warning == 2) {
			System.out.println("Knight: Prepares for battle");
		} else {
			System.out.println("That warning doesn't make any sense!");
		}
	}
}
