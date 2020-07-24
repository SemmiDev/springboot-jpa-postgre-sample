package com.sammidev.demo.repository;

import com.sammidev.demo.entity.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface CourseRepositoryCustom {

    @Query("select c from course c where c.id in " +
            "(select b.course from batch b " +
            "where b.startBatch between :firstDate and :lastDate)")
    List<Course> getCourseBaseOnStartDateBetweenDate(
            @Param("firstDate") Date firstDate,
            @Param("lastDate") Date lastDate);
}
