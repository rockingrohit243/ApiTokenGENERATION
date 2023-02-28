package com.Restwebservices.in.restfulwebservices.user;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity(name="user_Details")  //user is a keyword in h2 so changing the table
@JsonIgnoreProperties({"id"})
public class User {
	//@JsonIgnore// to ignore the properties  in the json
	@JsonProperty("JSON_ID")
	@Id
	@GeneratedValue//   RENAMING THE FIELD IN TD
	private Integer id;
	
	@Size(min=5,max=15,message="birthdate should be in te past")
	private String name;
	@Transient // IGNORE THE COLUMN IN THE TABLE OF H2
	int temp;
	@Past
	private LocalDate birthdate;
	public User(Integer id, String name, LocalDate birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}
	protected User()
	{
		
	}
	


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
	}
	
	

}
