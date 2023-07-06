package com.wipro.controller;

 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String HomePage() {
        return "index";
    }
    @RequestMapping(value = "/aboutus")
    public String aboutUs() {
        return "about";
    }
    @RequestMapping(value = "/contactus")
    public String contactUs() {
        return "contact";
    }
}
