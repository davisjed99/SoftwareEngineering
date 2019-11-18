package csce247.assignments.iterator;

public class Song {
	//Attributes
	private String name;
	private String artist;
	private double length;
	private String genre;
	
	//Initializer
	public Song(String name, String artist, double length, String genre) {
		this.name = name;
		this.artist = artist;
		this.length = length;
		this.genre = genre;
	}
	//Print out info
	public void print() {
		System.out.println("Name: " + name + ", Artist: " + artist + 
				", Length: " + length + ", Genre: " + genre);
	}
}
