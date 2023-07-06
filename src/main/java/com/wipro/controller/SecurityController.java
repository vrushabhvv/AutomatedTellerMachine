package com.wipro.controller;

import org.springframework.stereotype.Controller;

import jakarta.servlet.http.HttpSession;

@Controller
public class SecurityController {
	public String secureEndpoints(HttpSession session) {
		if(session.getAttribute("user")==null) {
			session.setAttribute("message","login first then access your account");
			return "redirect:/login";
		}
		else {
			return "";
		}
	}
}
