package com.sammidev.demo.controller;

import com.sammidev.demo.entity.Course;
import com.sammidev.demo.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public List<Course> getCourseName() {
        log.info(courseService.findAllCourse().toString());
        return courseService.findAllCourse();
    }

    @GetMapping("/getAll")
    public List<Course> getAllCourse() {
        return courseService.findAllCourse();
    }

    @GetMapping("/getByCode/{code}")
    public Course getCourseByCode(@PathVariable String code) {
        return courseService.findByCode(code);
    }

    @GetMapping("/getByName/{name}")
    public Course getCourseByName(@PathVariable String name) {
        return courseService.findByCode(name);
    }

    @GetMapping("/getCourseStartBetween/{firtsDate}/{lastDate}")
    public List<Course> getCourseByCode(
            @PathVariable("firtsDate") @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date firstDate,
            @PathVariable("lastDate") @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date lastDate) {
        return courseService.findCourseByStartBatchBetweenDate(firstDate, lastDate);
    }
}
