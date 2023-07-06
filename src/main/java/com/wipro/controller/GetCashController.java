package com.wipro.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.model.Customer;
import com.wipro.model.Transanction;
import com.wipro.service.CustomerServiceImpl;
import com.wipro.service.TransanctionServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class GetCashController {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	@Autowired
	private TransanctionServiceImpl transanctionServiceImpl;

	@RequestMapping("/getcash")
	public String getCash(HttpSession session) {
		if (session.getAttribute("user") == null) {
			session.setAttribute("message", "login first then access your account");
			return "redirect:/login";
		} else {
			return "getcash";
		}
	}

	@RequestMapping("/withdrawByGet")
	public String withdrawUseGetCash(@RequestParam("amount") double amount, @RequestParam("pin") String pin,
			HttpSession session, Transanction transanction) {
		if (session.getAttribute("user") == null) {
			session.setAttribute("message", "login first then access your account");
			return "redirect:/login";
		} else {
//        System.out.println(amount);
//        System.out.println(pin);
			String user = (String) session.getAttribute("user");
			String password = (String) session.getAttribute("password");
			Customer customer = this.customerServiceImpl.getCustomerByAccountAndPassword(user, password);
			if (customer.getCurrentBalance() < amount) {
				session.setAttribute("message", "insufficient balance");
				return "redirect:/getcash";
			} else {
				if (updateBalance(user, password, amount, pin, session).equals("valid")) {
					transanction.setTdesc(amount +" "+ "withdraw by get cash");
					transanction.setCustomer(customer);
					transanction.setDate(LocalDate.now());
					transanctionServiceImpl.saveTransanction(transanction);
					return "withdraw";
				} else {
					return "redirect:/getcash";
				}
			}
		}
	}

	public String updateBalance(String user, String password, double amount, String pin, HttpSession session) {
		if (session.getAttribute("user") == null) {
			session.setAttribute("message", "login first then access your account");
			return "redirect:/login";
		} else {
			Customer customer = this.customerServiceImpl.getCustomerByAccountAndPassword(user, password);
			System.out.println(customer);
			if (customer.getPin().equals(pin)) {
				double left_balance = (double) customer.getCurrentBalance() - amount;
//        	System.out.println(left_balance);
				customer.setCurrentBalance(left_balance);
				customerServiceImpl.updateAfterWithdrawl(customer);
				return "valid";

			} else {
				session.setAttribute("message", "Invalid Pin !! Try with another one");
				return "invalid";
			}
		}
	}
}
