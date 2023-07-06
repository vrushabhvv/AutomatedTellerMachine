package com.wipro.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.model.Cheque;
import com.wipro.model.Customer;
import com.wipro.model.Transanction;
import com.wipro.service.ChequeServiceImpl;
import com.wipro.service.CustomerServiceImpl;
import com.wipro.service.TransanctionServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class ByChequeDeposit {
	@Autowired
	private ChequeServiceImpl chequeServiceImpl;
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	@Autowired
	private TransanctionServiceImpl transanctionServiceImpl;

	@RequestMapping(value = "bycheque")
	public String byCheque(HttpSession session) {
		if (session.getAttribute("user") == null) {
			session.setAttribute("message", "login first then access your account");
			return "redirect:/login";
		} else {
			return "deposit";
		}
	}

	@RequestMapping("depositeByCheque")
	public String afterDeposit(@RequestParam("chequenumber") String chequeNumber,
			@RequestParam("accountnumber") String accountNumber, HttpSession session, Transanction transanction) {
		if (session.getAttribute("user") == null) {
			session.setAttribute("message", "login first then access your account");
			return "redirect:/login";
		} else {
			Cheque cheque = chequeServiceImpl.getByChequeId(chequeNumber);
			System.out.println(cheque);
			String currentacc = (String) session.getAttribute("user");
			String password = (String) session.getAttribute("password");
			System.out.println(currentacc);
			System.out.println(password);
			Customer customer = this.customerServiceImpl.getCustomerByAccountAndPassword(currentacc, password);
			System.out.println(customer);
			if ((cheque.getCheckNumber().equals(chequeNumber)) && (cheque.getAccNumber().equals(accountNumber))
					&& (cheque.getBankName().equals(customer.getBankName()))) {
				String amount = cheque.getAmountNumber();
				double after_add = (double) customer.getCurrentBalance() + Double.parseDouble(amount);
//        	System.out.println(left_balance);
				customer.setCurrentBalance(after_add);
				customerServiceImpl.updateAfterWithdrawl(customer);
				transanction.setTdesc(amount + "deposited");
				transanction.setCustomer(customer);
				transanction.setDate(LocalDate.now());
				transanctionServiceImpl.saveTransanction(transanction);
				System.out.println(customer.getTransanction());
//        	System.out.println(transanctionServiceImpl.getAllTransanction(customer.getCust_id()));
				return "depositemessage";
			} else {
				session.setAttribute("message", "something went wrong");
				return "redirect:/bycheque";
			}
		}

	}
}
