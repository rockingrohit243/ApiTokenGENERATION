
		package com.jpato2.in.JpaToh2.coursejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCMD implements CommandLineRunner{
	@Autowired
	private CourseJdbcRepository repository;
	@Override
	public void run(String... args) throws Exception
	{
		repository.insert(new Course(1,"rohit","rtjku",977654678,"rohit23@gmail.com","rohit1@3"));
		repository.insert(new Course(2,"sourabh","sou123",776546781,"sourabh23@gmail.com","sourabh1@3"));

	}
}
