package com.jpato2.in.JpaToh2.coursejdbc;



import jakarta.persistence.Column;

public class Course {
	
	

	@Column(nullable=false,unique=true,length=5)
	private long id;
	@Column(nullable=false,length=5)
	private String name;
	  
	@Column(nullable=false,unique=true)
	private String username;
	
	private long mobile_number;
	@Column(nullable=false,unique=true,length=10)
	private String email;
	private String password;
	public Course() {
		
	}
	
	
	public Course(long id, String name, String username, long mobile_number, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.mobile_number = mobile_number;
		this.email = email;
		this.password = password;
	}


	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", username=" + username + ", mobile_number=" + mobile_number
				+ ", email=" + email + ", password=" + password + "]";
	}
	
}
