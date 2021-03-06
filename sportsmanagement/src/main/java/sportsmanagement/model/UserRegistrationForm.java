package sportsmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class UserRegistrationForm {
	
	
	@Id
	private int id;
	private String sportname;
	private String username;
	private String email;
	@DateTimeFormat(pattern = "MM/DD/YYYY")
	private Date dob;
	private String mobile;
	private String gender;
	private String address;
	
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = Date.valueOf(dob);
	}

//	public void setDob(Date dob) {
//		this.dob = dob;
//	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

}
