package com.sammidev.demo.serviceImpl;

import com.sammidev.demo.entity.Course;
import com.sammidev.demo.repository.CourseRepository;
import com.sammidev.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseRepository batchRepository;

    @Override
    public List<Course> findAllCourse() {
        return courseRepository.findAll();
    }

    @Override
    public Course findByCode(String code) {
        return courseRepository.findByCode(code);
    }

    @Override
    public Course findByName(String name) {
        return courseRepository.findByName(name);
    }

    @Override
    public List<Course> findCourseByStartBatchBetweenDate(Date firstDate, Date lastDate) {
        return courseRepository.getCourseBaseOnStartDateBetweenDate(firstDate, lastDate);
    }
}
