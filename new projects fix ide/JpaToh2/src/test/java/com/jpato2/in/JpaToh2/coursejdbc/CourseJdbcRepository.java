
package com.jpato2.in.JpaToh2.coursejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	private static String INSERT_QUERY="""
			
			insert into course(id,name,username,mobilenumber,email,password) 
			values(?,?,?,?,?,?);
""";
    public void insert(Course course)
    {
		springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getUsername(),course.getMobile_number(),course.getEmail(),course.getPassword());
    }

}
