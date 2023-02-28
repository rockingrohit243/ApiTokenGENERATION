package com.springtest.in.springtestfile.controller;

import com.springtest.in.springtestfile.forCourse.Course;
import com.springtest.in.springtestfile.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired //mapping the courseservices class to object services
    private CourseServices services;



    @GetMapping("/courses")
public List<Course> getCourse(){
    return this.services.getCourse();
    }

    @GetMapping("/courses/{courseid}")
    public Course getACourse(@PathVariable long courseid){
        return this.services.getACourse(courseid);
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.services.addCourse(course);

    }
    @PutMapping("/courses")
            public Course updateCourse(
                    @RequestBody Course course)
    {
        return this.services.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseid}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long courseid)
    {
        try{
            this.services.deleteCourse(courseid);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }



}
