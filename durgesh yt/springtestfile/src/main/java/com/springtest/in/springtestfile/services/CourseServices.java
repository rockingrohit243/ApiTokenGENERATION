package com.springtest.in.springtestfile.services;

import com.springtest.in.springtestfile.forCourse.Course;

import java.util.List;

public interface CourseServices {
    public List<Course> getCourse();

  public Course getACourse(long courseid);


    Course addCourse(Course course);

    Course updateCourse(Course course);

    public void deleteCourse(long courseid);
}
