package com.example.spring_practise.controller;

import com.example.spring_practise.model.Skills;
import com.example.spring_practise.repo.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Component
public class SkillController {


    @Autowired
    SkillsRepo skillsRepo;

    @RequestMapping("skills")
    public ModelAndView modelClass(Skills skills) {
        ModelAndView mv = new ModelAndView();
        mv.addObject(skills);
        mv.setViewName("skill");
        skillsRepo.save(skills);
        return mv;
    }

    Skills gettingRequiredSkills;

    @RequestMapping("getSkills")
    public ModelAndView getSkill(@RequestParam("name") String name) {
        ModelAndView mv = new ModelAndView();
        gettingRequiredSkills = skillsRepo.findByName(name);
        mv.addObject("skills" , gettingRequiredSkills);
        mv.setViewName("skill_details");
        return mv;
    }
}
