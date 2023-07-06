package com.wipro.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

 

import com.wipro.model.Customer;
import com.wipro.service.CustomerServiceImpl;

 

import jakarta.servlet.http.HttpSession;

 

@Controller
public class LoginController {
    @Autowired
    CustomerServiceImpl customerServiceImpl;

 

    @RequestMapping(value = "/login")
    public String loginHandler() {
        return "login";
    }

 

    @RequestMapping(value = "/loginsearch", method = RequestMethod.POST)
    public String checkLogin(@RequestParam("cust_acc_number") String acc_number,
            @RequestParam("password") String password, Model model, HttpSession session) {
        System.out.println("session id" + session.getId());
        Customer customer = this.customerServiceImpl.getCustomerByAccountAndPassword(acc_number, password);
            System.out.println(customer);
        RedirectView rv = new RedirectView();
        if (customer == null) {
            session.setAttribute("message", "Invalid Details !! Try with another one");
            return "redirect:/login";
        } else {

 

            if (acc_number.equals(session.getAttribute("user"))) {
                session.setAttribute("message", "Already logged in!!");
                return "alreadylogin";
            } else {
//                System.out.println(customer.getAccountNumber());
                session.setAttribute("user",acc_number);
                session.setAttribute("password",password);
//                System.out.println(session.getAttribute("user"));
                return "redirect:/dashboard";
            }
        }
    }

    @RequestMapping(value = "/alreadylogin")
    public String handleAlreadyLogin() {
        return "alreadylogin";
    }

    @RequestMapping(value = "/dashboard")
    public String showDashboard(HttpSession session) {
    	if (session.getAttribute("user") == null) {
			session.setAttribute("message", "login first then access your account");
			return "redirect:/login";
		}
    	else {
            return "dashboard";
    	}
    }
}