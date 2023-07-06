package com.wipro.controller;

 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

 

import jakarta.servlet.http.HttpSession;

 

@Controller
public class LogoutController {
    @RequestMapping(value = "logout")
    public RedirectView afterLogout(HttpSession session) {
        session.invalidate();
        RedirectView rv = new RedirectView();
        rv.setUrl("/");
        return rv;

 

    }
}
