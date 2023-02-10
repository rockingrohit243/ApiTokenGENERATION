package com.springtest.in.springtestfile.dao;

import com.springtest.in.springtestfile.forCourse.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {
}
