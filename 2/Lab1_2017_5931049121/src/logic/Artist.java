package logic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Artist {
	// START CODE HERE
	private String name;
	private String email;
	private char gender;
	private Date dob;
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return ("Artist [name="+name+", email="+email+", gender="+gender+", dob="+dateFormat.format(dob)+"]");
	}

	public Artist(String name, String email, char gender, Date dob) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public Date getDob() {
		return dob;
	}

	// END CODE HERE
	// Hint:dateFormat.format(.....) to print date in the required format
}
