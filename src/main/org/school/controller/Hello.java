package main.org.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Hello {

    @RequestMapping("/welcome")
    public ModelAndView helloWorld(){
        String message="Hello You";
        return new ModelAndView("welcome","message",message);
    }

}