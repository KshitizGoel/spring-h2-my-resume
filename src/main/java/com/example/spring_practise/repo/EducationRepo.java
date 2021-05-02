package com.example.spring_practise.repo;

import com.example.spring_practise.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EducationRepo extends JpaRepository<Education, String> {


    Education findByName(String name);
}
