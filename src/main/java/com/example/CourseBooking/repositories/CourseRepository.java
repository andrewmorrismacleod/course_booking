package com.example.CourseBooking.repositories;

import com.example.CourseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> getAllCoursesByRating(int rating);
    public List<Course> getCoursesForCustomerId(Long customerId);
}
