package com.udacity.jwdnd.c1.review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

       @RequestMapping("/home")
        public String getHomePage(){
           return "home";
       }

}
