package za.ac.pdgswd.employeedemo.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Employee {
	private long id;
	private String name;
	private String shortname;
	private String email;
	private String telephone;
	private String bio;
				
	public Employee(){ 
		
	}
	
	
	public Employee(long id, String name, String shortname, String email,
			String telephone, String bio) {
		this.id = id;
		this.name = name;
		this.shortname = shortname;
		this.email = email;
		this.telephone = telephone;
		this.bio = bio;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	
}
