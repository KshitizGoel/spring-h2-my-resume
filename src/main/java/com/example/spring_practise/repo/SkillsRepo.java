package com.example.spring_practise.repo;

import com.example.spring_practise.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface SkillsRepo extends JpaRepository<Skills , String> {

    Skills findByName(String name);

}
