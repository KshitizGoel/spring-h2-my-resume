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

    Education educationDetails;

    @RequestMapping("getEducation")
    public ModelAndView getEducation(@RequestParam("name") String name) {
        ModelAndView mv = new ModelAndView();
        educationDetails = repo.findByName(name);
        mv.addObject("education_details" , educationDetails);
        mv.setViewName("education_details");
        System.out.println("Getting the data in Education Controller here!!!!!!");
        System.out.println(educationDetails.getName() + "\n" + educationDetails.getSchool_name() + "\n" + educationDetails.getCollege_name());
        return  mv;
    }

}
