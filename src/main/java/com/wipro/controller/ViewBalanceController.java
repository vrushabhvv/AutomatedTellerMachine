package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.model.Customer;
import com.wipro.service.CustomerServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class ViewBalanceController {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@RequestMapping("viewbalance")
	public String viewBalance(HttpSession session, Model model) {
		if (session.getAttribute("user") == null) {
			session.setAttribute("message", "login first then access your account");
			return "redirect:/login";
		} else {
			String user = (String) session.getAttribute("user");
			String password = (String) session.getAttribute("password");
			Customer customer = this.customerServiceImpl.getCustomerByAccountAndPassword(user, password);
			System.out.println(customer.getCurrentBalance());
			model.addAttribute("currentbalance", customer.getCurrentBalance());
			return "viewbalance";
		}
	}
}
