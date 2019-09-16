package csce247.assignments.observer;

public class ShopOwner implements Observer {
	//Create variable watchman as Subject
	private Subject watchman;
	//Was not in the requirement but this was my best guess to get it to work :(
	private ShopOwner shop;
	
	//Initialize ShopOwner with Subject watchman for some reason
	public ShopOwner(Subject watchman) {
		//this.watchman = watchman;
		//Register into the list
		watchman.registerObserver(shop);
	}
	//Send correct message with the right warning int
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Shop Owner: Close down shop and head home");
		} else if (warning == 2) {
			System.out.println("Shop Owner: Drops everything and find nearest hideout");
		} else {
			System.out.println("That warning doesn't make any sense!");
		}
	}
}
