package com.springtest.in.springtestfile.dao;

import com.springtest.in.springtestfile.forCourse.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {

    @Query("SELECT CASE WHEN COUNT(s) >0 then true else false end from Person s WHERE s.personId=?1")
    Boolean isPersonExitsById(Integer id);
}
