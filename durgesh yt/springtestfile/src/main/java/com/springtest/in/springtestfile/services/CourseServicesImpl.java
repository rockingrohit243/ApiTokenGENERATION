package com.springtest.in.springtestfile.services;

import com.springtest.in.springtestfile.dao.CourseDao;
import com.springtest.in.springtestfile.forCourse.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service // this is a service class
public class CourseServicesImpl implements CourseServices{
    @Autowired
    private CourseDao dao;
//List<Course> list;
public CourseServicesImpl()
{
//    list=new ArrayList<>();
//    list.add(new Course(1,"java","learn java "));
//    list.add(new Course(2,"aws","learn aws "));
}
    @Override
    public List<Course> getCourse() {
        return dao.findAll();
    }
    @Override
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

    @Override
    public void deleteCourse(long courseid) {
//list=list.stream().filter(e->e.getId()!=courseid).collect(Collectors.toList());
       Course entity= dao.getOne(courseid);
       dao.delete(entity);
}


}
