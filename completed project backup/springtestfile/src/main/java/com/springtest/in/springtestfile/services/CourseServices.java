package com.springtest.in.springtestfile.services;

import com.springtest.in.springtestfile.forCourse.Course;
import com.springtest.in.springtestfile.repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServices {
    @Autowired
    private CourseDao dao;

    public List<Course> getCourse() {

        return dao.findAll();
    }

    public Course getACourse(long courseid) {
//    Course c=null;
//    for(Course course:list)
//    {
//        if (course.getId()==courseid)
//        {
//            c=course;
//            break;
//        }
//    }
        return dao.getOne(courseid);
    }
    public Course addCourse(Course course)
    {
//        list.add(course);
        dao.save(course);
        return course;
    }

    public Course updateCourse(Course course) {
//         list.forEach(e -> {
//             if (e.getId() == course.getId()) {
//                 e.setTitle(course.getTitle());
//                 e.setDescription(course.getDescription());
//             }
//         });
        dao.save(course);//update also
        return course;
    }


    public void deleteCourse(long courseid) {
//list=list.stream().filter(e->e.getId()!=courseid).collect(Collectors.toList());
        Course entity= dao.getOne(courseid);
        dao.delete(entity);
    }
    public CourseServices(CourseDao dao)
    {
        this.dao=dao;
    }
}
