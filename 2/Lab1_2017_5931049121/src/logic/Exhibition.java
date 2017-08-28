package logic;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class Exhibition {
	// START CODE HERE
	private final int MAX_ART_WORK = 10;
	private String name;
	private ArtWork artwork[];
	private int numArtWorks = 0;

	public Exhibition(String name) {
		super();
		this.name = name;
		artwork = new ArtWork[MAX_ART_WORK];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumArtWorks() {
		return numArtWorks;
	}

	public void addArtWork(ArtWork artWork) {
		if (numArtWorks + 1 > MAX_ART_WORK) {
			System.out.println("Cannot add another artwork.");
		} else {
			artwork[numArtWorks] = artWork;
			// System.out.println(artwork[numArtWorks]);
			numArtWorks += 1;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();
		// Exhibition [name=beds and dreams, artworks=[ArtWork [name=My Bed,
		// artists=[Artist [name=Tracy Emin, email=office@traceyeminstudio.com,
		// gender=f, dob=03/07/1963]], medium=Box frame, mattress, linens, pillows and
		// various objects, year=1998, id=L03662, price=2200000]
		String s = "Exhibition [name=" + name + ", artworks=";
		List<ArtWork> ss = new ArrayList<>();
		for (ArtWork s1 : artwork) {
			ss.add(s1);
			// System.out.println(s);
		}
		return s+ss.toString()+"]";
	}

	// END CODE HERE
	public static void main(String[] args) throws ParseException {

		// TRY EXPERIMENT WITH YOUR CLASSES AND OBJECTS HERE
	}

}
