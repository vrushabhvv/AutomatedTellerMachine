package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.model.Customer;
import com.wipro.service.CustomerServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class ChangePinController {
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@RequestMapping("changepin")
	public String changePin(HttpSession session) {
		if (session.getAttribute("user") == null) {
			session.setAttribute("message", "login first then access your account");
			return "redirect:/login";
		} else {
			return "changepin";
		}
	}

	@RequestMapping("updatepin")
	public String updatePin(@RequestParam("currentpin") String oldpin, @RequestParam("newpin") String npin,
			HttpSession session) {
		if (session.getAttribute("user") == null) {
			session.setAttribute("message", "login first then access your account");
			return "redirect:/login";
		} else {
//		System.out.println(oldpin);
//		System.out.println(npin);
//		System.out.println(session.getAttribute("user"));
			String user = (String) session.getAttribute("user");
			String password = (String) session.getAttribute("password");
			Customer customer = this.customerServiceImpl.getCustomerByAccountAndPassword(user, password);
//		System.out.println(customer);
			if ((oldpin.equals(npin))) {
				session.setAttribute("message", "your old pin should not be same as new pin");
				return "redirect:/changepin";
			}

			else if (verifyOldPin(oldpin, customer).equals("valid")) {
				customer.setPin(npin);
				customerServiceImpl.updatePin(customer);
				return "changepinmessage";
			} else {
				session.setAttribute("message", "your old pin is not matching with our records!!please try once again");
				return "redirect:/changepin";
			}
		}
	}

	private String verifyOldPin(String oldpin, Customer customer) {
		if (oldpin.equals(customer.getPin())) {
			return "valid";
		} else {
			return "invalid";
		}

	}
}
