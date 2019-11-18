package csce247.assignments.iterator;

import java.util.Iterator;

public class AlbumIterator implements Iterator {
	//Attributes
	private Song[] songs;
	private int position = 0;
	
	//Initializer
	public AlbumIterator(Song[] songs) {
		this.songs = songs;
	}
	//Check if there's space in the array
	public boolean hasNext() {
		if(position >= songs.length || songs[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	//Move song to next position
	public Song next() {
		Song song = songs[position];
		position++;
		return song;
	}
}
