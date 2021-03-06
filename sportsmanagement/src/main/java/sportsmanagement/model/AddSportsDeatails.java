package sportsmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class AddSportsDeatails {
	
	@Id
	private int id;
	private String sportname;
	private String collegename;
	private String location;
	@DateTimeFormat(pattern = "MM/DD/YYYY")
	private Date date;
	private int firstprice;
	private int secondprice;
	private int thirdprice;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
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

	public void setDate(String inDate) {
		this.date = Date.valueOf(inDate);
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
	
	@Override
	public String toString() {
		return collegename + ": " + date + ": " + firstprice + ": " + sportname;
		
	}
}
