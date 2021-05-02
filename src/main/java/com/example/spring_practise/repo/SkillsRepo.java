package com.example.spring_practise.repo;

import com.example.spring_practise.model.Skills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SkillsRepo extends CrudRepository<Skills , String> {

    Skills findByName(String name);

}
