package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomMapEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.model.Customer;
import com.wipro.service.CustomerServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class ForgotPassword {
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	@RequestMapping("forgotpassword")
	public String forgotPassword() {
		return "accounttextbox";
	}
	
	@RequestMapping("searchaccount")
	public String searchAccount(@RequestParam("cust_acc_number") String accnumber,HttpSession session) {
//		customerServiceImpl.getAllCustomer();
		List<Customer> allCustomer = customerServiceImpl.getAllCustomer();
		String present="";
		for(Customer customer:allCustomer) {
			if(customer.getAccountNumber().equals(accnumber)) {
				session.setAttribute("account",accnumber);
				return "changepassword";
			}
		}
		session.setAttribute("message","account does not exist");
		return "redirect:/forgotpassword";
	}
	
	@RequestMapping("updatepassword")
	public String updatePassword(@RequestParam("oldpassword") String oldpassword,@RequestParam("newpassword") String newpassword,HttpSession session) {
		System.out.println(oldpassword);
		System.out.println(newpassword);
		String user = (String) session.getAttribute("account");
//		String password = (String) session.getAttribute("password");
		Customer customer = this.customerServiceImpl.getCustomerByAccount(user);
		System.out.println(customer.getAccountNumber());
		if(oldpassword.equals(newpassword)) {
			session.setAttribute("message","old password and new password cannot be same");
			return "changepassword";
		}
		else if(customer.getPassword().equals(oldpassword)) {
			customer.setPassword(newpassword);
			customerServiceImpl.updatePassword(customer);
			session.setAttribute("message","password changed successfully please login again");
			return "passwordupdated";
		}
		else {
			session.setAttribute("message","password is not matching with previous password");
			return "changepassword";
		}
		
	}
}
