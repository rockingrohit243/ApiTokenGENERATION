package com.springtest.in.springtestfile.repository;

import com.springtest.in.springtestfile.forCourse.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CourseDao extends JpaRepository<Course,Long> {

    @Query("SELECT CASE WHEN COUNT(s) >0 then true else false end from Course  s WHERE s.id=?1")
    Boolean isPersonExitsById(Integer id);
}
