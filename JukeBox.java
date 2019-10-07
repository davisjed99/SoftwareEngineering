package csce247.assignments.singleton;

import java.util.LinkedList;
import java.util.Queue;

public class JukeBox {
	//Create a queue to be filled with songs
	private Queue<String> songQueue = new LinkedList();
	private static JukeBox jukeBox;
	
	private JukeBox() {}
	
	//Initialize JukeBox
	public static JukeBox getInstance() {
		if (jukeBox == null) {
			System.out.println("Creating a jukebox");
			jukeBox = new JukeBox();
		}
		return jukeBox;
	}
	
	//If there's a song, play it
	public void playNextSong() {
		if (!songQueue.isEmpty()) {
			System.out.println("Let's jam to " + songQueue.remove());
		} else {
			System.out.println("You need to add songs to the list");
		}
	}
	
	//Add a song to the queue
	public void requestSong(String song) {
		songQueue.add(song);
		System.out.println(song + " is now number " + songQueue.size() + " on the list");
	}
	
	//Returns true is the queue is not empty
	public boolean hasMoreSongs() {
		if (!songQueue.isEmpty()) {
			return true;
		} else
			return false;
	}
	
	//Gives access to songQueue, purely for testing
	public String nextSong() {
		return songQueue.peek();
	}
	
	//Gives access to songQueue, purely for testing
	public void removeSong() {
		songQueue.remove();
	}
}
