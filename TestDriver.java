package csce247.assignments.singleton;

public class TestDriver {

	public static void main(String[] args) {
		
		requestPass();
		hasMoreSongsPass();
		removePass();
	}
	public static boolean requestPass() {
		System.out.println("Testing if requestPass()");
		JukeBox jukeBox = JukeBox.getInstance();
		jukeBox.requestSong("Song");
		if (jukeBox.nextSong() == "Song") {
			System.out.println("True");
			System.out.println("");
			jukeBox.removeSong();
			return true;
		} else {
			System.out.println("False");
			System.out.println("");
			jukeBox.removeSong();
			return false;
		}
	}
	
	public static boolean hasMoreSongsPass() {
		System.out.println("Testing if hasMoreSongsPass()");
		JukeBox jukeBox = JukeBox.getInstance();
		jukeBox.requestSong("Song");
		if (jukeBox.hasMoreSongs() == true) {
			System.out.println("True");
			System.out.println("");
			jukeBox.removeSong();
			return true;
		} else {
			System.out.println("False");
			System.out.println("");
			jukeBox.removeSong();
			return false;
		}
	}
	
	public static boolean removePass() {
		System.out.println("Testing if removePass()");
		JukeBox jukeBox = JukeBox.getInstance();
		jukeBox.requestSong("Song");
		jukeBox.removeSong();
		if (jukeBox.hasMoreSongs() == false) {
			System.out.println("True");
			System.out.println("");
			return true;
		} else {
			System.out.println("False");
			System.out.println("");
			return false;
		}
	}
	
	

}
