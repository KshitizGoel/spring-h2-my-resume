package com.example.spring_practise.controller;

import com.example.spring_practise.model.Education;
import com.example.spring_practise.repo.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EducationController {


    @Autowired
    EducationRepo repo;

    @RequestMapping("education")
    public ModelAndView addEducation(Education education) {
        ModelAndView mv = new ModelAndView();
        mv.addObject(education);
        mv.setViewName("education_form");
        repo.save(education);
        return mv;
    }


}
