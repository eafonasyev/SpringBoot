package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRest {

    @GetMapping("/")
        public String showPage(){
        return "this  my world";
        }
    @GetMapping("/workout")
        public String showWorkout(){
        return "get my new code";
    }

    @GetMapping("/new")
    public String showNew(){
        return "get my NEWEST SHOWNEW";
    }
    @GetMapping("/new2")
    public String showNew2(){
        return "get my NEWEST SHOWNEW";
    }
    @GetMapping("/new3")
    public String showNew3(){
        return "get my NEWEST SHOWNEW";
    }

    @GetMapping("/new4")
    public String showNew4(){
        return "get my NEWEST SHOWNEW";
    }


    @GetMapping("/new5")
    public String showNew5(){
        return "get my NEWEST SHOWNEW";
    }
}
