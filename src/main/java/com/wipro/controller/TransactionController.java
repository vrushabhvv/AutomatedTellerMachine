package com.wipro.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.model.Customer;
import com.wipro.model.Transanction;
import com.wipro.service.CustomerServiceImpl;
import com.wipro.service.TransanctionServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class TransactionController {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	@Autowired
	private TransanctionServiceImpl transanctionServiceImpl;

	@RequestMapping("transanction")
	public String getTransanction(HttpSession session, Model model) {
		if (session.getAttribute("user") == null) {
			session.setAttribute("message", "login first then access your account");
			return "redirect:/login";
		} else {
			String currentacc = (String) session.getAttribute("user");
			String password = (String) session.getAttribute("password");
			Customer customer = this.customerServiceImpl.getCustomerByAccountAndPassword(currentacc, password);
			List<Transanction> allTransanction = transanctionServiceImpl.getAllTransanction(customer.getCust_id());
			 int totalTransactions =allTransanction.size();
	          int startIndex = Math.max(totalTransactions - 10, 0);
	          int endIndex = Math.max(totalTransactions, 0);
	           List<Transanction> subList = allTransanction.subList(startIndex, endIndex);
	           Collections.reverse(subList);
			model.addAttribute("transactions",subList);
			return "ministatement";
		}
	}

}
