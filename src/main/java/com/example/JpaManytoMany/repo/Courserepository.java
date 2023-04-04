package com.example.JpaManytoMany.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaManytoMany.entity.Course;
import com.example.JpaManytoMany.entity.Student;

public interface Courserepository  extends JpaRepository<Course,Long>{

//	List<Course> findlessthanprice(double price);

}
