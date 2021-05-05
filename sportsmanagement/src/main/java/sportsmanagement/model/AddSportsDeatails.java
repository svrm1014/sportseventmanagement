package sportsmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AddSportsDeatails {
	
	@Id
	private int id;
	private String sportname;
	private String collegename;
	private String location;
	private Date date;
	private int firstprice;
	private int secondprice;
	private int thirdprice;

	public AddSportsDeatails() {
		
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getSportname() {
		return sportname;
	}


	public void setSportname(String sportname) {
		this.sportname = sportname;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getFirstprice() { return firstprice; }

	public void setFirstprice(int firstprice) { this.firstprice = firstprice; }

	public int getSecondprice() {
		return secondprice;
	}

	public void setSecondprice(int secondprice) {
		this.secondprice = secondprice;
	}

	public int getThirdprice() {
		return thirdprice;
	}

	public void setThirdprice(int thirdprice) {
		this.thirdprice = thirdprice;
	}

	

}