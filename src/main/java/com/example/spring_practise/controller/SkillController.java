package com.example.spring_practise.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Component
public class SkillController {

    @RequestMapping("skills")
    public ModelAndView modelClass(@RequestParam("name") String username){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", username);
        mv.setViewName("skill");
        return mv;
    }
}
