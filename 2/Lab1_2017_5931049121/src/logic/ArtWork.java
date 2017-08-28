package logic;

import java.util.Arrays;

public class ArtWork  {
	// START CODE HERE
	private String name;
	private Artist artists[];
	private String medium;
	private int year;
	private String id;
	private int price;

	public String getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Artist[] getArtists() {
		return artists;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return ("ArtWork [name="+name+", artists="+Arrays.deepToString(artists)+", medium="+medium+", year="+year+", id="+id+", price="+price+"]");
	}

	public String getMedium() {
		return medium;
	}

	public int getYear() {
		return year;
	}

	// END CODE HERE
	// Hint: use Arrays.toString to print array
	public ArtWork(String name, Artist[] artists, String medium, int year, String id, int price) {
		super();
		this.name = name;
		this.artists = artists;
		this.medium = medium;
		this.year = year;
		this.id = id;
		this.price = price;
	}
}
