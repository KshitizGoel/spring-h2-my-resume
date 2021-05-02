package com.example.spring_practise.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
 public class EducationController {

    @RequestMapping("education")
    public ModelAndView addEducation(@RequestParam("name") String username){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", username);
        mv.setViewName("education_form");
        return mv;
    }

}
