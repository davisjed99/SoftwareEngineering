package csce247.assignments.iterator;

import java.util.Iterator;

public class Album {
	//Attributes
	static final int MAX_SONGS = 50;
	private Song[] songs = new Song[MAX_SONGS];
	private int count = 0;
	private String name;
	
	//Initializer
	public Album(String name) {
		this.name = name;
	}
	//Add song
	public void addSong(String name, String artist, double length, String genre) {
		//There should be an if else statement here making sure you can't add songs past the limit but I forgot
		//Add song
		Song song = new Song(name, artist, length, genre);
		songs[count] = song;
		count++;
	}
	//Create generic type iterator
	public AlbumIterator createIterator() {
		return new AlbumIterator(songs);
	}
}
